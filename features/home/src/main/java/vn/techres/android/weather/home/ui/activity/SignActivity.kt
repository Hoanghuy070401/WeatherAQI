package vn.techres.android.weather.home.ui.activity

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.database.annotations.Nullable
import okhttp3.Call
import vn.techres.android.weather.app.AppActivity
import vn.techres.android.weather.home.databinding.ActivitySignBinding


class SignActivity : AppActivity() {
    private lateinit var binding :ActivitySignBinding
    private var client: GoogleSignInClient? = null
    override fun getLayoutView(): View {
        binding= ActivitySignBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun initView() {
        //
    }

    override fun initData() {
       //
        val options = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(vn.techres.android.weather.home.R.string.default_web_client_id))
            .requestEmail()
            .build()
        client = GoogleSignIn.getClient(this, options)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1234) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account: GoogleSignInAccount = task.getResult(ApiException::class.java)
                val credential = GoogleAuthProvider.getCredential(account.idToken, null)
                FirebaseAuth.getInstance().signInWithCredential(credential)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            finish()
                        } else {
                            Toast.makeText(
                                this@SignActivity,
                                task.exception!!.message.toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            } catch (e: ApiException) {
                e.printStackTrace()
            }
        }
    }

    override fun onStart(call: Call) {
        super.onStart(call)
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            val intent = Intent(this, SignActivity::class.java)
            startActivity(intent)
        }
    }

}
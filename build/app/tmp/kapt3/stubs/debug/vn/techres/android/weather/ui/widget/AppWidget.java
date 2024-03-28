package vn.techres.android.weather.ui.widget;

import java.lang.System;

/**
 * Implementation of App Widget functionality.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u00a8\u0006\u0014"}, d2 = {"Lvn/techres/android/weather/ui/widget/AppWidget;", "Landroid/appwidget/AppWidgetProvider;", "()V", "onDeleted", "", "context", "Landroid/content/Context;", "appWidgetIds", "", "onDisabled", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "updateWidgetData", "views", "Landroid/widget/RemoteViews;", "app_debug"})
public final class AppWidget extends android.appwidget.AppWidgetProvider {
    
    public AppWidget() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"RemoteViewLayout"})
    @java.lang.Override
    public void onUpdate(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull
    int[] appWidgetIds) {
    }
    
    @android.annotation.SuppressLint(value = {"RemoteViewLayout"})
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    @java.lang.Override
    public void onEnabled(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onDeleted(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    int[] appWidgetIds) {
    }
    
    @java.lang.Override
    public void onDisabled(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
    }
    
    private final void updateWidgetData(android.content.Context context, android.widget.RemoteViews views) {
    }
}
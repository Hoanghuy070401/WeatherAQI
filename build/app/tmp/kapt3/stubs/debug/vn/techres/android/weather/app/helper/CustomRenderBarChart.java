package vn.techres.android.weather.app.helper;

import java.lang.System;

/**
 * @Author: 阮仲伦 Nguyễn Trọng Luân
 * @Date: 12/26/22
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J#\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lvn/techres/android/weather/app/helper/CustomRenderBarChart;", "Lcom/github/mikephil/charting/renderer/BarChartRenderer;", "chart", "Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;", "animator", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "viewPortHandler", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "(Lcom/github/mikephil/charting/interfaces/dataprovider/BarDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "mRadius", "", "drawDataSet", "", "c", "Landroid/graphics/Canvas;", "dataSet", "Lcom/github/mikephil/charting/interfaces/datasets/IBarDataSet;", "index", "", "drawHighlighted", "indices", "", "Lcom/github/mikephil/charting/highlight/Highlight;", "(Landroid/graphics/Canvas;[Lcom/github/mikephil/charting/highlight/Highlight;)V", "setmRadius", "Companion", "app_debug"})
public final class CustomRenderBarChart extends com.github.mikephil.charting.renderer.BarChartRenderer {
    private float mRadius = 16.0F;
    @org.jetbrains.annotations.NotNull
    public static final vn.techres.android.weather.app.helper.CustomRenderBarChart.Companion Companion = null;
    
    public CustomRenderBarChart(@org.jetbrains.annotations.Nullable
    com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider chart, @org.jetbrains.annotations.Nullable
    com.github.mikephil.charting.animation.ChartAnimator animator, @org.jetbrains.annotations.Nullable
    com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler) {
        super(null, null, null);
    }
    
    public final void setmRadius(float mRadius) {
    }
    
    @java.lang.Override
    protected void drawDataSet(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.interfaces.datasets.IBarDataSet dataSet, int index) {
    }
    
    @java.lang.Override
    public void drawHighlighted(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
    com.github.mikephil.charting.highlight.Highlight[] indices) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r\u00a8\u0006\u0011"}, d2 = {"Lvn/techres/android/weather/app/helper/CustomRenderBarChart$Companion;", "", "()V", "roundedRect", "Landroid/graphics/Path;", "left", "", "top", "right", "bottom", "rx", "ry", "tl", "", "tr", "br", "bl", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.graphics.Path roundedRect(float left, float top, float right, float bottom, float rx, float ry, boolean tl, boolean tr, boolean br, boolean bl) {
            return null;
        }
    }
}
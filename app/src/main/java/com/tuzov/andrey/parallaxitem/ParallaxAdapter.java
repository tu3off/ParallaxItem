package com.tuzov.andrey.parallaxitem;

import android.graphics.Matrix;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by andrey on 25.10.15.
 */
public abstract class ParallaxAdapter extends BaseAdapter {

    private static final float DEFAULT_UP_VALUE = 0.5f;
    private static final float DEFAULT_DOWN_VALUE = -0.5f;

    private Matrix matrix;

    public abstract void onUpScroll(View childView);

    public abstract void onDownScroll(View childView);

    protected final void upScroll(ImageView imageView, float effectValue) {
        matrix = imageView.getImageMatrix();
        matrix.postTranslate(0, effectValue);
        imageView.setImageMatrix(matrix);
        imageView.invalidate();
    }

    protected final void downScroll(ImageView imageView, float effectValue) {
        matrix = imageView.getImageMatrix();
        matrix.postTranslate(0, effectValue);
        imageView.setImageMatrix(matrix);
        imageView.invalidate();
    }


    protected final void upScroll(ImageView imageView) {
        upScroll(imageView, DEFAULT_UP_VALUE);
    }

    protected final void downScroll(ImageView imageView) {
        downScroll(imageView, DEFAULT_DOWN_VALUE);
    }


}

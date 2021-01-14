package com.whatsapp.conversation.conversationrow;

import X.C08490bD;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ConversationRowDocument$DocumentPreviewView extends C08490bD {
    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        float f;
        if (getDrawable() != null) {
            Matrix imageMatrix = getImageMatrix();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = getDrawable().getIntrinsicWidth();
            int intrinsicHeight = getDrawable().getIntrinsicHeight();
            if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                f = ((float) measuredHeight) / ((float) intrinsicHeight);
            } else {
                f = ((float) measuredWidth) / ((float) intrinsicWidth);
            }
            float f2 = (float) measuredHeight;
            imageMatrix.setRectToRect(new RectF(0.0f, 0.0f, (float) intrinsicWidth, f2 / f), new RectF(0.0f, 0.0f, (float) measuredWidth, f2), Matrix.ScaleToFit.FILL);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }
}

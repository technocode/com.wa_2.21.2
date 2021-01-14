package com.whatsapp.doodle;

import X.AnonymousClass2ME;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.whatsapp.WaEditText;

public class DoodleEditText extends WaEditText {
    public int A00 = 0;
    public AnonymousClass2ME A01;

    public DoodleEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, null);
    }

    @Override // com.whatsapp.WaEditText
    public void onDraw(Canvas canvas) {
        if (this.A00 == 3) {
            setTextColor(-16777216);
            getPaint().setStrokeWidth(getTextSize() / 12.0f);
            getPaint().setStyle(Paint.Style.STROKE);
            super.onDraw(canvas);
            setTextColor(-1);
            getPaint().setStrokeWidth(0.0f);
            getPaint().setStyle(Paint.Style.FILL);
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AnonymousClass2ME r0 = this.A01;
        if (r0 != null) {
            r0.AGv(i, keyEvent);
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r4 == 3) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFontStyle(int r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            if (r0 != r4) goto L_0x0005
            return
        L_0x0005:
            r3.A00 = r4
            r2 = 1
            r1 = 3
            if (r4 != r1) goto L_0x001a
            android.content.Context r0 = r3.getContext()
            android.graphics.Typeface r0 = X.C53232ck.A00(r0)
            r3.setTypeface(r0)
        L_0x0016:
            r3.setAllCaps(r2)
            return
        L_0x001a:
            r0 = 2
            if (r4 != r0) goto L_0x002d
            android.content.Context r0 = r3.getContext()
            android.graphics.Typeface r0 = X.C53232ck.A01(r0)
            r3.setTypeface(r0)
        L_0x0028:
            r0 = 0
            r3.setAllCaps(r0)
            return
        L_0x002d:
            if (r4 != r2) goto L_0x0035
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r0)
            goto L_0x0028
        L_0x0035:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r3.setTypeface(r0)
            if (r4 != r1) goto L_0x0028
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.doodle.DoodleEditText.setFontStyle(int):void");
    }

    public void setOnKeyPreImeListener(AnonymousClass2ME r1) {
        this.A01 = r1;
    }
}

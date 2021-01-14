package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.WaEditText;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;

/* renamed from: X.29i  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC463429i extends WaEditText {
    public float A00;
    public int A01;
    public TextPaint A02;
    public String A03;
    public String A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass01X A06;

    public AbstractC463429i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002;
        AnonymousClass03P r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A06 = A002;
        this.A05 = !isInEditMode() ? AnonymousClass03P.A00() : r1;
    }

    public boolean A03() {
        if (!(this instanceof FinalBackspaceAwareEntry)) {
            return TextUtils.isEmpty(getText());
        }
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) this;
        return TextUtils.isEmpty(finalBackspaceAwareEntry.A05(finalBackspaceAwareEntry.getText()));
    }

    @Override // com.whatsapp.WaEditText, X.C07670Zb
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = this.A01;
        if (i != 0) {
            int i2 = editorInfo.imeOptions;
            int i3 = i2 & 255;
            if ((i3 & i) != 0) {
                int i4 = i2 ^ i3;
                editorInfo.imeOptions = i4;
                int i5 = i | i4;
                editorInfo.imeOptions = i5;
                i2 = i5;
            }
            if ((1073741824 & i2) != 0) {
                editorInfo.imeOptions = i2 & -1073741825;
            }
        }
        return onCreateInputConnection;
    }

    @Override // com.whatsapp.WaEditText
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.A02 != null && !TextUtils.isEmpty(this.A04) && A03()) {
            AnonymousClass01X r0 = this.A06;
            if (r0 == null || r0.A0M()) {
                canvas.drawText(this.A04, (float) getPaddingLeft(), ((float) getTotalPaddingTop()) - this.A00, this.A02);
                return;
            }
            this.A02.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(this.A04, (float) (getWidth() - getPaddingRight()), ((float) getTotalPaddingTop()) - this.A00, this.A02);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.A03) && A03()) {
            accessibilityNodeInfo.setText(this.A03);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A03 != null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (this.A02 == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A02 = textPaint;
                textPaint.setColor(getHintTextColors().getDefaultColor());
                this.A02.setTextSize(getTextSize());
                this.A02.setTextAlign(Paint.Align.LEFT);
            }
            this.A04 = TextUtils.ellipsize(this.A03, this.A02, (float) measuredWidth, TextUtils.TruncateAt.END).toString();
            this.A00 = this.A02.getFontMetrics().top;
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.A03) && A03()) {
            accessibilityEvent.getText().add(this.A03);
        }
    }

    public void setHint(String str) {
        this.A03 = str;
        this.A04 = null;
        requestLayout();
    }

    public void setInputEnterAction(int i) {
        this.A01 = i;
        setRawInputType(180225);
        if (i == 0) {
            i = 1073741824;
        }
        AnonymousClass03P r0 = this.A05;
        if (r0 != null) {
            ContentResolver A062 = r0.A06();
            if (A062 == null) {
                Log.w("conversation-text-entry/set-input-enter-action cr=null");
            } else if ("com.htc.android.htcime/.HTCIMEService".equals(Settings.Secure.getString(A062, "default_input_method"))) {
                i |= 268435456;
            }
        }
        setImeOptions(i);
    }
}

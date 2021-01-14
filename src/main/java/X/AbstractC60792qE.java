package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.2qE  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC60792qE extends InterceptingEditText implements TextWatcher {
    public float A00;
    public int A01 = getCursorVerticalPadding();
    public int A02 = getCursorWidth();
    public Handler A03 = new Handler(Looper.getMainLooper());
    public Runnable A04 = new RunnableEBaseShape11S0100000_I1_6(this, 13);
    public boolean A05 = false;
    public boolean A06;
    public boolean A07;
    public final Paint A08 = new Paint(1);
    public final RectF A09 = new RectF();

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public abstract int getCursorColor();

    public abstract int getCursorVerticalPadding();

    public abstract int getCursorWidth();

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AbstractC60792qE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setColor(getCursorColor());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: android.text.SpannableStringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (r4 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r13) {
        /*
        // Method dump skipped, instructions count: 534
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC60792qE.afterTextChanged(android.text.Editable):void");
    }

    public boolean hasFocus() {
        return this.A06;
    }

    @Override // com.whatsapp.WaEditText
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A05 && this.A07) {
            RectF rectF = this.A09;
            float f = this.A00;
            rectF.set(f, (float) this.A01, ((float) this.A02) + f, (float) (getHeight() - this.A01));
            canvas.drawRect(rectF, this.A08);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (getText() == null || TextUtils.isEmpty(getText().toString())) {
            this.A00 = 0.0f;
            super.onMeasure(i, i2);
            return;
        }
        PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
        float A032 = paymentAmountInputField.A03(getText().toString(), paymentAmountInputField.getTextSize());
        this.A00 = A032;
        if (this.A05) {
            i3 = this.A02;
        } else {
            i3 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (A032 + ((float) i3) + ((float) getPaddingLeft()) + ((float) getPaddingRight())), 1073741824), i2);
    }

    public void setCustomCursorEnabled(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            this.A03.removeCallbacks(this.A04);
            this.A03.post(this.A04);
            boolean z2 = !z;
            setFocusable(z2);
            setCursorVisible(z2);
            if (z) {
                addTextChangedListener(this);
            } else {
                removeTextChangedListener(this);
            }
        }
    }

    public void setHasFocus(boolean z) {
        if (z != this.A06) {
            this.A06 = z;
            this.A03.removeCallbacks(this.A04);
            this.A03.post(this.A04);
        }
    }
}

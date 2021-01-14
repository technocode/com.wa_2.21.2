package X;

import android.content.Context;
import android.graphics.Canvas;
import com.google.android.search.verification.client.R;

/* renamed from: X.2n3  reason: invalid class name and case insensitive filesystem */
public class C59092n3 extends AbstractC51572Zg {
    public int A00;

    @Override // X.AbstractC51572Zg
    public void A0K() {
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r1, boolean z) {
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return 0;
    }

    @Override // X.AnonymousClass2I2
    public void onDraw(Canvas canvas) {
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public C59092n3(Context context, AbstractC007503q r2) {
        super(context, r2);
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_album_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_album_right;
    }

    @Override // X.AbstractC51572Zg, X.AnonymousClass2I2
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, this.A00);
    }

    public void setFixedHeight(int i) {
        this.A00 = i;
    }
}

package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;

/* renamed from: X.1ox  reason: invalid class name and case insensitive filesystem */
public class C37891ox implements AnonymousClass11B {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ AbstractC008905s A01;
    public final /* synthetic */ AbstractC009505y A02;

    public C37891ox(AbstractC009505y r1, AbstractC008905s r2, AnonymousClass05q r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 3));
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setOnClickListener(null);
    }
}

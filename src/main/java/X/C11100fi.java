package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.ViewSharedContactArrayActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.0fi  reason: invalid class name and case insensitive filesystem */
public class C11100fi extends AnonymousClass0JW {
    public final AnonymousClass0CO A00 = AnonymousClass0CO.A00();
    public final C04360Kb A01 = C04360Kb.A00();
    public final AnonymousClass00S A02 = AnonymousClass00S.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final AnonymousClass01K A04 = AnonymousClass01K.A00();
    public final AnonymousClass02N A05;
    public final AnonymousClass02U A06;
    public final C007303n A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final boolean A0B;

    public C11100fi(ViewSharedContactArrayActivity viewSharedContactArrayActivity, AnonymousClass02N r3, ArrayList arrayList, ArrayList arrayList2, boolean z, C007303n r7, AnonymousClass02U r8) {
        this.A08 = new WeakReference(viewSharedContactArrayActivity);
        this.A05 = r3;
        this.A09 = arrayList;
        this.A0A = arrayList2;
        this.A0B = z;
        this.A07 = r7;
        this.A06 = r8;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A08.get();
        if (r2 != null) {
            r2.APv(R.string.processing, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Boolean bool = (Boolean) obj;
        ActivityC004702f r1 = (ActivityC004702f) this.A08.get();
        if (r1 != null) {
            r1.A0K.A00();
            if (bool.booleanValue()) {
                r1.setResult(-1);
                r1.finish();
                return;
            }
            r1.APo(R.string.must_have_displayname);
        }
    }
}

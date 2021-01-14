package X;

import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* renamed from: X.0fQ  reason: invalid class name and case insensitive filesystem */
public class C10920fQ extends AnonymousClass0JW {
    public final AnonymousClass0GG A00;
    public final AnonymousClass0HI A01;
    public final AnonymousClass01A A02;
    public final C02120As A03;
    public final AnonymousClass01T A04;
    public final AnonymousClass02N A05;
    public final WeakReference A06;
    public final HashSet A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public C10920fQ(ContactPickerFragment contactPickerFragment, HashSet hashSet, AnonymousClass02N r4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, AnonymousClass01A r17, AnonymousClass0GG r18, AnonymousClass0HI r19, C02120As r20, AnonymousClass01T r21) {
        this.A06 = new WeakReference(contactPickerFragment);
        this.A07 = hashSet;
        this.A05 = r4;
        this.A0C = z;
        this.A09 = z2;
        this.A0J = z3;
        this.A0B = z4;
        this.A0E = z5;
        this.A0I = z6;
        this.A0A = z7;
        this.A0D = z8;
        this.A0F = z9;
        this.A0H = z10;
        this.A0G = z11;
        this.A08 = z12;
        this.A02 = r17;
        this.A00 = r18;
        this.A01 = r19;
        this.A03 = r20;
        this.A04 = r21;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        AnonymousClass2GT[] r3 = (AnonymousClass2GT[]) objArr;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
        if (contactPickerFragment != null && contactPickerFragment.A0U()) {
            contactPickerFragment.A14(r3[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r8.A0s != false) goto L_0x005c;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10920fQ.A03(java.lang.Object):void");
    }
}

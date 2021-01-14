package X;

import android.database.ContentObserver;
import android.util.SparseArray;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2kP  reason: invalid class name and case insensitive filesystem */
public class C57502kP implements AnonymousClass2UI {
    public static final boolean A0I;
    public int A00;
    public int A01;
    public C47942Kh A02;
    public C47942Kh A03;
    public C10220eH A04;
    public C10210eG A05;
    public C10210eG A06;
    public MediaViewFragment A07;
    public Runnable A08;
    public boolean A09;
    public boolean A0A;
    public final ContentObserver A0B = new AnonymousClass2UJ(this);
    public final SparseArray A0C = new SparseArray();
    public final AnonymousClass01K A0D;
    public final AnonymousClass0BV A0E;
    public final AnonymousClass02N A0F;
    public final AnonymousClass0M3 A0G;
    public final AnonymousClass00T A0H;

    @Override // X.AnonymousClass2UI
    public void AHr() {
    }

    @Override // X.AnonymousClass2UI
    public void AQq(int i) {
    }

    static {
        boolean z = false;
        if (!C006803i.A0g()) {
            z = true;
        }
        A0I = z;
    }

    public C57502kP(MediaViewFragment mediaViewFragment, AnonymousClass00T r4, AnonymousClass0M3 r5, AnonymousClass02N r6, AnonymousClass01K r7, AnonymousClass0BV r8) {
        this.A07 = mediaViewFragment;
        this.A0G = r5;
        this.A0H = r4;
        this.A0F = r6;
        this.A0D = r7;
        this.A0E = r8;
        this.A0C.put(0, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b1  */
    @Override // X.AnonymousClass2UI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0M3 A7O(int r20) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57502kP.A7O(int):X.0M3");
    }

    @Override // X.AnonymousClass2UI
    public int A8U(C007303n r6) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A0C;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                if (r6.equals(((AbstractC007503q) sparseArray.get(keyAt)).A0n)) {
                    StringBuilder A0S = AnonymousClass008.A0S("MediaMessagesNavigator/navigator/getItemPosition/ ");
                    A0S.append(r6.A01);
                    A0S.append(" ");
                    A0S.append(this.A00 + keyAt);
                    Log.d(A0S.toString());
                    return this.A00 + keyAt;
                }
                i++;
            } else {
                StringBuilder A0S2 = AnonymousClass008.A0S("MediaMessagesNavigator/navigator/getItemPosition/ ");
                A0S2.append(r6.A01);
                A0S2.append(" none");
                Log.d(A0S2.toString());
                return -2;
            }
        }
    }

    @Override // X.AnonymousClass2UI
    public void AOB(Runnable runnable) {
        this.A08 = runnable;
    }

    @Override // X.AnonymousClass2UI
    public void AQ4() {
        C10220eH r2 = new C10220eH(this, this.A0F, this.A0G, this.A0D, this.A0E);
        this.A04 = r2;
        this.A0H.ANC(r2, new Void[0]);
    }

    @Override // X.AnonymousClass2UI
    public void AQE() {
        C10220eH r0 = this.A04;
        if (r0 != null && !((AnonymousClass0JW) r0).A00.isCancelled()) {
            ((AnonymousClass0JW) this.A04).A00.cancel(true);
        }
    }

    @Override // X.AnonymousClass2UI
    public void close() {
        AQE();
        C47942Kh r0 = this.A02;
        if (r0 != null) {
            r0.close();
        }
        this.A02 = null;
        C47942Kh r02 = this.A03;
        if (r02 != null) {
            r02.close();
        }
        this.A03 = null;
        C10210eG r03 = this.A05;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
        }
        this.A05 = null;
        C10210eG r04 = this.A06;
        if (r04 != null) {
            ((AnonymousClass0JW) r04).A00.cancel(true);
        }
        this.A06 = null;
        this.A09 = false;
        this.A0A = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0C.clear();
    }

    @Override // X.AnonymousClass2UI
    public int getCount() {
        return this.A00 + 1 + this.A01;
    }
}

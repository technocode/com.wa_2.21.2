package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1xW  reason: invalid class name and case insensitive filesystem */
public class C42931xW extends AbstractC28091Sw {
    public static final String A0F;
    public static final String A0G;
    public static final String A0H;
    public static volatile C42931xW A0I;
    public C43921zD A00;
    public Long A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass08V A04 = new AnonymousClass08V(50);
    public final AnonymousClass02M A05;
    public final AnonymousClass0CL A06;
    public final C28061Ss A07;
    public final AnonymousClass00S A08;
    public final AnonymousClass00G A09;
    public final AnonymousClass00D A0A;
    public final AnonymousClass01X A0B;
    public final AnonymousClass00Y A0C;
    public final C02040Ak A0D;
    public final C02030Aj A0E;

    static {
        StringBuilder A0S = AnonymousClass008.A0S("downloadable");
        String str = File.separator;
        String A0O = AnonymousClass008.A0O(A0S, str, "bloks_pay");
        A0F = A0O;
        StringBuilder sb = new StringBuilder();
        sb.append(A0O);
        A0G = AnonymousClass008.A0O(sb, str, "image");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0O);
        A0H = AnonymousClass008.A0O(sb2, str, "layout");
    }

    public C42931xW(AnonymousClass00G r3, AnonymousClass00S r4, AnonymousClass02M r5, AnonymousClass00T r6, AnonymousClass0CL r7, AnonymousClass00Y r8, AnonymousClass01X r9, C28061Ss r10, AnonymousClass03U r11, C02660Cy r12, AnonymousClass00D r13, C02040Ak r14, C02030Aj r15) {
        super(r5, r6, r11, r12);
        this.A09 = r3;
        this.A08 = r4;
        this.A05 = r5;
        this.A06 = r7;
        this.A0C = r8;
        this.A0B = r9;
        this.A07 = r10;
        this.A0A = r13;
        this.A0D = r14;
        this.A0E = r15;
        super.A00 = 15;
        super.A01 = 4;
    }

    public static C42931xW A00() {
        if (A0I == null) {
            synchronized (C42931xW.class) {
                if (A0I == null) {
                    A0I = new C42931xW(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass0CL.A00(), AnonymousClass00Y.A00(), AnonymousClass01X.A00(), C28061Ss.A00(), AnonymousClass03U.A00(), C02660Cy.A00(), AnonymousClass00D.A00(), C02040Ak.A00(), C02030Aj.A00);
                }
            }
        }
        return A0I;
    }

    public final C43921zD A03() {
        C43921zD r2 = new C43921zD();
        int i = 0;
        if (C05870Qv.A0D.A02.equals(C05870Qv.A01(this.A0A.A0F()).A02)) {
            i = 4;
        }
        r2.A02 = Long.valueOf((long) i);
        r2.A05 = "2.21.2.4";
        r2.A01 = Boolean.valueOf(this.A03);
        r2.A06 = this.A02;
        return r2;
    }

    public final synchronized File A04(String str) {
        File file = new File(this.A09.A00.getFilesDir(), str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BloksAssetManager/prepareDir/Could not make directory ");
        sb.append(file.getAbsolutePath());
        Log.e(sb.toString());
        return null;
    }

    public void A05(String str, boolean z, AnonymousClass1Sv r13) {
        this.A03 = z;
        this.A02 = str;
        if (super.A07) {
            super.A05.ANF(new RunnableEBaseShape6S0200000_I1_1(this, r13, 46));
        } else if (!super.A07) {
            super.A07 = true;
            super.A06 = false;
            super.A05.ANC(new C11000fY(super.A02, super.A04, this, super.A03, r13), new Void[0]);
        } else if (r13 != null) {
            AnonymousClass3H3 r9 = (AnonymousClass3H3) r13;
            r9.A00.setVisibility(8);
            AnonymousClass1PT r2 = r9.A01;
            ((ActivityC004702f) r2).A0F.A06(R.string.payments_not_ready, 0);
            r2.finish();
        }
    }

    public boolean A06() {
        StringBuilder sb = new StringBuilder("2.21.2.4");
        AnonymousClass00D r1 = this.A0A;
        sb.append(C05870Qv.A01(r1.A0F()).A02);
        sb.append(" ");
        sb.append(this.A0B.A04());
        return sb.toString().equals(r1.A00.getString("bloks_version", null));
    }
}

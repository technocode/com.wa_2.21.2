package X;

import android.app.Activity;
import android.os.Build;
import android.os.Environment;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.io.File;
import java.util.Map;

/* renamed from: X.3aA  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC74123aA extends AbstractC71663Pv {
    public AnonymousClass32V A00;
    public final C002701k A01;
    public final C04420Kh A02 = C04420Kh.A00();
    public final AbstractC007503q A03;
    public final C09140cM A04 = C09140cM.A00();
    public final AnonymousClass32W A05;
    public final AbstractView$OnClickListenerC08330av A06;
    public final AbstractView$OnClickListenerC08330av A07;
    public final AbstractView$OnClickListenerC08330av A08;

    public AbstractC74123aA(AbstractC007503q r24, AbstractC71533Pi r25) {
        super(r25);
        if (AnonymousClass32W.A0J == null) {
            synchronized (AnonymousClass32W.class) {
                if (AnonymousClass32W.A0J == null) {
                    AnonymousClass32W.A0J = new AnonymousClass32W(C002701k.A00(), AnonymousClass0GZ.A00(), AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass088.A00(), C02590Cr.A00(), C000300f.A00(), C06180Sc.A00(), C02780Dk.A02(), C02770Dj.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00(), C02560Co.A01, C48032Kq.A00(), C02580Cq.A01(), AnonymousClass37E.A00(), AnonymousClass0D1.A00(), AnonymousClass1MC.A00, C660132l.A00());
                }
            }
        }
        this.A05 = AnonymousClass32W.A0J;
        this.A01 = C002701k.A00();
        this.A06 = new ViewOnClickCListenerShape14S0100000_I1_3(this, 5);
        this.A08 = new ViewOnClickCListenerShape14S0100000_I1_3(this, 6);
        this.A07 = new ViewOnClickCListenerShape14S0100000_I1_3(this, 7);
        this.A03 = r24;
    }

    @Override // X.AbstractC71663Pv
    public void A0H() {
        super.A0H();
        AbstractC007503q r1 = this.A03;
        if (r1 instanceof AnonymousClass0M3) {
            AnonymousClass0M4 r0 = ((AnonymousClass0M3) r1).A02;
            if (r0 != null) {
                File file = r0.A0F;
                if (file != null && !file.exists()) {
                    C04370Kc r5 = this.A0K;
                    Activity activity = (Activity) A0A();
                    if (r5 != null) {
                        String externalStorageState = Environment.getExternalStorageState();
                        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
                            AnonymousClass02M r2 = r5.A00;
                            boolean A012 = AnonymousClass00C.A01();
                            int i = R.string.need_sd_card_shared_storage;
                            if (A012) {
                                i = R.string.need_sd_card;
                            }
                            r2.A06(i, 1);
                        }
                        if (Build.VERSION.SDK_INT < 23 || r5.A03.A02("android.permission.READ_EXTERNAL_STORAGE") != -1) {
                            r5.A00.A06(r5.A01(), 1);
                            return;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        int i3 = R.string.permission_storage_need_write_access_v30;
                        if (i2 < 30) {
                            i3 = R.string.permission_storage_need_write_access;
                        }
                        RequestPermissionActivity.A09(activity, R.string.permission_storage_need_write_access_request, i3);
                        return;
                    }
                    throw null;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC71663Pv
    public void A0J() {
        AbstractC659732h A0C = A0C();
        C02560Co r0 = this.A0H;
        AbstractC007503q r1 = this.A03;
        if (C28051Sr.A1t(r0, r1) || r1.A0r) {
            A0C.A04.setVisibility(8);
            return;
        }
        AnonymousClass0M3 r12 = (AnonymousClass0M3) r1;
        AnonymousClass0M4 r9 = r12.A02;
        if (r9 != null) {
            boolean z = true;
            if (r9.A0a) {
                A0C.A04.setVisibility(0);
                A0C.A04.setBackgroundDrawable(null);
                CircularProgressBar circularProgressBar = A0C.A0E;
                long j = r9.A0C;
                if (!(j == 0 || j == 100)) {
                    z = false;
                }
                circularProgressBar.setIndeterminate(z);
                A0C.A0E.setProgress((int) r9.A0C);
                A0C.A0E.setVisibility(0);
                A0C.A0E.setOnClickListener(null);
                A0C.A0B.setVisibility(8);
                A0C.A00.setVisibility(8);
            } else if (r9.A07 == 1) {
                A0C.A04.setVisibility(8);
                if (r12.A0m == 2) {
                    A0C.A0C.setText(this.A0D.A06(R.string.gallery_unsafe_audio_removed));
                } else {
                    A0C.A0C.setText(this.A0D.A06(R.string.gallery_unsafe_video_removed));
                }
                A0C.A0C.setVisibility(0);
            } else if (r9.A0P) {
                A0C.A04.setVisibility(8);
            } else {
                A0C.A04.setBackgroundResource(R.drawable.download_background);
                A0C.A04.setVisibility(0);
                A0C.A0E.setVisibility(8);
                A0C.A0E.setOnClickListener(null);
                A0C.A0B.setVisibility(0);
                A0C.A0B.setText(this.A0D.A06(R.string.button_download));
                A0C.A0B.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
                A0C.A0B.setOnClickListener(this.A06);
                A0C.A00.setVisibility(8);
            }
        } else {
            throw null;
        }
    }

    @Override // X.AbstractC71663Pv
    public void A0L(int i) {
        Object of;
        C27081Nw r3;
        super.A0L(i);
        AbstractC007503q r5 = this.A03;
        C007303n r4 = r5.A0n;
        boolean z = r4.A02;
        int i2 = 3;
        if (z || (A0B().A07() && ((AbstractC71663Pv) this).A03)) {
            i2 = 1;
        } else if (r5 instanceof AnonymousClass0M3) {
            AnonymousClass0M4 r0 = ((AnonymousClass0M3) r5).A02;
            if (r0 == null) {
                throw null;
            } else if (r0.A0a) {
                i2 = 2;
            }
        }
        StringBuilder A0T = AnonymousClass008.A0T("playbackPage/reportStatusExitStats result:", i2, " loading:");
        C04600Kz r6 = this.A0L;
        A0T.append(r6.A00());
        A0T.append(" viewed:");
        C04600Kz r7 = this.A0N;
        A0T.append(r7.A00());
        A0T.append(" paused: ");
        A0T.append(this.A0M.A00());
        A0T.append(" duration:");
        A0T.append(A0B().A00());
        Log.d(A0T.toString());
        C04380Kd r11 = this.A0C;
        long A002 = A0B().A00();
        long A003 = r6.A00();
        long A004 = r7.A00();
        C27091Nz r62 = r11.A01;
        if (r62 != null) {
            Map map = r62.A09;
            if (z) {
                of = AnonymousClass02Z.A00;
            } else {
                of = UserJid.of(r5.A07());
            }
            AnonymousClass1Nx r32 = (AnonymousClass1Nx) map.get(of);
            if (r32 != null && (r3 = (C27081Nw) r32.A07.get(r4)) != null) {
                r3.A04 = i2;
                r3.A06 = A002;
                r3.A07 += A003;
                r3.A08 += A004;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r20 == 6) goto L_0x001f;
     */
    @Override // X.AbstractC71663Pv
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 405
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC74123aA.A0M(int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r6 == 100) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q() {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC74123aA.A0Q():void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" for ");
        AbstractC007503q r2 = this.A03;
        sb.append(r2.A0n);
        sb.append(" ");
        sb.append(r2.A07());
        sb.append(" ");
        sb.append((int) r2.A0m);
        return sb.toString();
    }
}

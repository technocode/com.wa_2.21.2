package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1Y6  reason: invalid class name */
public abstract class AnonymousClass1Y6 extends ActivityC004602e implements AbstractC07290Ww {
    public long A00;
    public Uri A01;
    public ImageView A02;
    public ViewPager A03;
    public PagerSlidingTabStrip A04;
    public C64712yd A05;
    public C07550Yd A06;
    public C08460b9 A07;
    public ContactQrMyCodeFragment A08;
    public QrScanCodeFragment A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D = false;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AnonymousClass0EW A0H = AnonymousClass0EW.A01;
    public final AnonymousClass01I A0I = AnonymousClass01I.A00();
    public final AnonymousClass01A A0J = AnonymousClass01A.A00();
    public final AnonymousClass0AI A0K = AnonymousClass0AI.A00();
    public final AnonymousClass0XN A0L = AnonymousClass0XN.A00();
    public final AnonymousClass04j A0M = AnonymousClass04j.A00();
    public final AnonymousClass03S A0N = AnonymousClass03S.A00();
    public final AnonymousClass01X A0O = AnonymousClass01X.A00();
    public final AnonymousClass01Q A0P = AnonymousClass01Q.A00();
    public final AnonymousClass01P A0Q = AnonymousClass01P.A00();
    public final AnonymousClass00Y A0R = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0S = AnonymousClass09H.A01();
    public final AnonymousClass0IA A0T = AnonymousClass0IA.A00();
    public final C02040Ak A0U = C02040Ak.A00();
    public final C01970Ad A0V = C01970Ad.A00();
    public final AbstractC64722ye A0W = new AnonymousClass3MD(this);
    public final AnonymousClass00T A0X = C002101e.A00();

    public final int A0T(int i) {
        boolean A0M2 = this.A0O.A0M();
        if (i == 0) {
            return !A0M2 ? 1 : 0;
        }
        if (i != 1) {
            return -1;
        }
        return A0M2 ? 1 : 0;
    }

    public void A0U() {
        if (!this.A0N.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_sharing_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_sharing;
            }
            A0H(RequestPermissionActivity.A05(this, R.string.permission_storage_need_write_access_on_sharing_request, i2, false), 4);
        } else if (this.A0A == null) {
            Log.e("BaseQrActivity/shareFailed/noQr");
            ((ActivityC004702f) this).A0F.A06(R.string.share_failed, 0);
        } else {
            A0G(R.string.contact_qr_wait);
            AnonymousClass00T r5 = this.A0X;
            AnonymousClass01X r8 = this.A0O;
            boolean z = true;
            C09970dp r4 = new C09970dp(this, r8.A0D(R.string.contact_qr_email_body_with_link, AnonymousClass008.A0K("https://wa.me/qr/", this.A0A)));
            Bitmap[] bitmapArr = new Bitmap[1];
            AnonymousClass01I r0 = this.A0I;
            r0.A04();
            AnonymousClass0HR r2 = r0.A01;
            if (r2 != null) {
                if (super.A0J.A00.getInt("privacy_profile_photo", 0) != 0) {
                    z = false;
                }
                bitmapArr[0] = C002001d.A0U(this, r2, z, AnonymousClass008.A0K("https://wa.me/qr/", this.A0A), r8.A06(R.string.contact_qr_share_prompt));
                r5.ANC(r4, bitmapArr);
                return;
            }
            throw null;
        }
    }

    public final void A0V() {
        if (this.A09 == null) {
            return;
        }
        if (this.A0N.A02("android.permission.CAMERA") != 0) {
            startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_contact_qr_scan_request).putExtra("message_params_id", R.string.localized_app_name).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_contact_qr_scan).putExtra("perm_denial_message_params_id", R.string.localized_app_name).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 1);
            return;
        }
        this.A09.A0n();
    }

    public final void A0W(Bitmap bitmap) {
        ImageView imageView = this.A02;
        if (bitmap == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.A02.setImageBitmap(bitmap);
    }

    public final void A0X(boolean z) {
        String str;
        A0G(R.string.contact_qr_wait);
        this.A0E = true;
        this.A0F = z;
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass3MG r14 = new AnonymousClass3MG(((ActivityC004702f) this).A0F, this.A0S, new AnonymousClass3MF(this));
        AnonymousClass09H r10 = r14.A01;
        String A022 = r10.A02();
        AnonymousClass0OS[] r3 = new AnonymousClass0OS[2];
        r3[0] = new AnonymousClass0OS("type", "contact", null, (byte) 0);
        if (z) {
            str = "revoke";
        } else {
            str = "get";
        }
        r3[1] = new AnonymousClass0OS("action", str, null, (byte) 0);
        AnonymousClass0M5 r4 = new AnonymousClass0M5("qr", r3, null, null);
        r10.A07(215, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:qr", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0)}, r4), r14, 32000);
    }

    public boolean A0Y(String str, boolean z, int i) {
        if (((AbstractC07560Ye) this.A06).A0D || this.A0E) {
            return false;
        }
        this.A0B = str;
        return this.A06.A02(str, z, i);
    }

    @Override // X.AbstractC07290Ww
    public void AIx() {
        if (!C002001d.A3D(this)) {
            if (this.A0C) {
                finish();
                return;
            }
            A0W(null);
            if (this.A09 != null) {
                ((AbstractC07560Ye) this.A06).A0D = false;
                this.A09.A06 = null;
            }
        }
    }

    public /* synthetic */ void lambda$onCreate$2360$BaseQrActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.A09.A06 = null;
                } else if (i == 4 && i2 == -1) {
                    A0U();
                }
            } else if (i2 != -1) {
                this.A0E = false;
            } else if (intent != null) {
                Uri data = intent.getData();
                this.A01 = data;
                if (data != null) {
                    A0G(R.string.contact_qr_wait);
                    this.A0X.ANC(new C09950dn(this, this.A01, this.A02.getWidth(), this.A02.getHeight()), new Void[0]);
                    return;
                }
                ((ActivityC004702f) this).A0F.A06(R.string.error_load_image, 0);
                this.A0E = false;
            }
        } else if (i2 != 0) {
            this.A09.A0n();
        } else if (this.A0G) {
            finish();
        } else {
            this.A03.A0B(!this.A0O.A0M(), true);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r11 = this.A0O;
        setTitle(r11.A06(R.string.contact_qr_title));
        setContentView(R.layout.contact_qr);
        Toolbar toolbar = (Toolbar) AnonymousClass0TX.A0A(this, R.id.toolbar);
        toolbar.setNavigationIcon(new C06470Tj(r11, C002001d.A0e(getResources().getDrawable(R.drawable.ic_back_teal), getResources().getColor(R.color.tealActionBarItemDrawableTint))));
        toolbar.setTitle(r11.A06(R.string.contact_qr_title));
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 13));
        A0C(toolbar);
        this.A05 = new C64712yd();
        this.A03 = (ViewPager) AnonymousClass0TX.A0A(this, R.id.contact_qr_pager);
        this.A04 = (PagerSlidingTabStrip) AnonymousClass0TX.A0A(this, R.id.contact_qr_tab_strip);
        ImageView imageView = (ImageView) AnonymousClass0TX.A0A(this, R.id.contact_qr_preview);
        this.A02 = imageView;
        AnonymousClass0Q7.A0W(imageView, 2);
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        AnonymousClass01I r02 = this.A0I;
        AnonymousClass00T r03 = this.A0X;
        AnonymousClass00Y r04 = this.A0R;
        C000300f r10 = ((ActivityC004702f) this).A0G;
        C07550Yd r05 = new C07550Yd(r0, r02, r03, r04, r10, ((ActivityC004602e) this).A05, this.A0S, this.A0J, super.A0I, this.A0H, this.A0V, this.A0L, this.A0M, this.A0Q, this.A0P, this.A0U, this.A0T, this.A0K, this, r10.A0D(AbstractC000400g.A0N), r10.A0D(AbstractC000400g.A1X), true, false, 3);
        this.A06 = r05;
        r05.A00 = true;
        C08460b9 r3 = new C08460b9(this, A04());
        this.A07 = r3;
        this.A03.setAdapter(r3);
        this.A03.A0F(new AnonymousClass3ZC(this));
        AnonymousClass0Q7.A0X(this.A04, 0);
        this.A04.setViewPager(this.A03);
        String stringExtra = getIntent().getStringExtra("qrcode");
        this.A0B = stringExtra;
        if (stringExtra != null) {
            this.A0C = true;
            A0Y(stringExtra, false, 5);
        }
        if (!this.A0C) {
            A0X(false);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("scan", false);
        this.A0G = booleanExtra;
        boolean A0M2 = r11.A0M();
        if (!booleanExtra) {
            A0M2 = !A0M2 ? 1 : 0;
        }
        ViewPager viewPager = this.A03;
        int i = A0M2 ? 1 : 0;
        int i2 = A0M2 ? 1 : 0;
        int i3 = A0M2 ? 1 : 0;
        viewPager.A0B(i, false);
        C08460b9 r32 = this.A07;
        if (r32 != null) {
            int i4 = 0;
            do {
                C64862yv r06 = r32.A00[i4];
                boolean z = false;
                if (i4 == A0M2) {
                    z = true;
                }
                r06.A00.setSelected(z);
                i4++;
            } while (i4 < 2);
            return;
        }
        throw null;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        int A0T2 = A0T(this.A03.getCurrentItem());
        if (A0T2 != 0) {
            if (A0T2 == 1) {
                menu.setGroupVisible(0, false);
            }
            return true;
        }
        menu.setGroupVisible(0, true);
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        super.onStart();
        this.A05.A01(super.A0I, getWindow());
        A0W(null);
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        this.A05.A00(getWindow());
        super.onStop();
    }
}

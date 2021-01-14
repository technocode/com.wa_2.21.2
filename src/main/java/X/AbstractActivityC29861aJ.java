package X;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.qrcode.QrScannerView;

/* renamed from: X.1aJ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractActivityC29861aJ extends ActivityC004602e {
    public Handler A00;
    public HandlerThread A01;
    public View A02;
    public View A03;
    public QrScannerView A04;
    public String A05;
    public boolean A06 = true;
    public boolean A07;
    public final Camera.PreviewCallback A08 = new C64762yj(this);
    public final C37251nt A09 = new C37251nt();
    public final AnonymousClass03S A0A = AnonymousClass03S.A00();
    public final AnonymousClass0Fh A0B = AnonymousClass0Fh.A00();

    public void A0T() {
        if (this.A0A.A02("android.permission.CAMERA") != 0) {
            this.A04.setVisibility(8);
            this.A02.setVisibility(8);
            this.A03.setVisibility(0);
            startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_cam).putExtra("message_id", R.string.permission_cam_access_on_wa_web_connect_request).putExtra("message_params_id", new int[]{R.string.localized_app_name}).putExtra("perm_denial_message_id", R.string.permission_cam_access_on_wa_web_connect).putExtra("perm_denial_message_params_id", new int[]{R.string.localized_app_name}).putExtra("permissions", new String[]{"android.permission.CAMERA"}).putExtra("force_ui", true), 1);
            return;
        }
        this.A04.setVisibility(0);
        this.A02.setVisibility(0);
        this.A03.setVisibility(8);
    }

    public void A0U() {
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        r2.A02.post(new RunnableEBaseShape12S0100000_I1_7(this, 10));
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            finish();
        } else {
            this.A04.setVisibility(0);
            this.A02.setVisibility(0);
            this.A03.setVisibility(8);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        A0A().A0H(5);
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.scan_qr_code));
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.qr_code_scanner, (ViewGroup) null, false));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A0O(false);
            HandlerThread handlerThread = new HandlerThread("QrDecode");
            this.A01 = handlerThread;
            handlerThread.start();
            this.A00 = new Handler(this.A01.getLooper());
            this.A06 = this.A0J.A00.getBoolean("qr_education", true);
            this.A02 = findViewById(R.id.overlay);
            this.A04 = (QrScannerView) findViewById(R.id.camera);
            this.A03 = findViewById(R.id.shade);
            this.A04.A06 = new AnonymousClass3MC(this);
            View findViewById = findViewById(R.id.ok);
            View findViewById2 = findViewById(R.id.education);
            findViewById.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(this, findViewById2, 26));
            if (this.A06) {
                findViewById2.setVisibility(0);
                this.A04.setVisibility(8);
                this.A02.setVisibility(8);
                this.A03.setVisibility(0);
                return;
            }
            findViewById2.setVisibility(8);
            A0T();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A01.quit();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        if (this.A04.getVisibility() == 0) {
            this.A04.setVisibility(4);
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (this.A04.getVisibility() == 4) {
            this.A04.setVisibility(0);
        }
    }
}

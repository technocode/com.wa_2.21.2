package X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.3Mh  reason: invalid class name and case insensitive filesystem */
public class DialogC70763Mh extends DialogC26681Ly {
    public int A00 = 0;
    public final /* synthetic */ RegisterName A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC70763Mh(RegisterName registerName, AnonymousClass01X r4) {
        super(registerName, r4, R.layout.initialise_new_user, true);
        this.A01 = registerName;
    }

    public void A00(int i) {
        byte[] bArr;
        AnonymousClass008.A0v("registername/updatestate/state ", i);
        this.A00 = i;
        if (i != 1) {
            RegisterName registerName = this.A01;
            if (!((AnonymousClass0GE) registerName).A0P.A02()) {
                registerName.A15.A03();
                findViewById(R.id.initial_sync_progress).setVisibility(0);
                findViewById(R.id.photo_progress).setVisibility(0);
                return;
            }
        }
        findViewById(R.id.initial_sync_progress).setVisibility(4);
        findViewById(R.id.photo_progress).setVisibility(4);
        RegisterName registerName2 = this.A01;
        AnonymousClass00D r12 = ((ActivityC004702f) registerName2).A0J;
        SharedPreferences sharedPreferences = r12.A00;
        sharedPreferences.edit().remove("com.whatsapp.registername.initializer_start_time").apply();
        View view = registerName2.A05;
        if (view != null) {
            view.setVisibility(4);
        }
        registerName2.A03.removeMessages(0);
        Log.i("registername/sync/finished");
        registerName2.startActivity(new Intent(registerName2, Main.class));
        registerName2.finish();
        RegisterName.A1K = null;
        C002001d.A2N(registerName2, 0);
        if (registerName2.A13 != null) {
            if (sharedPreferences.getLong("eula_accepted_time", 0) > 0) {
                C446320w r2 = new C446320w();
                r2.A07 = Long.valueOf(System.currentTimeMillis() - sharedPreferences.getLong("eula_accepted_time", 0));
                r2.A08 = Long.valueOf(System.currentTimeMillis() - sharedPreferences.getLong("message_store_verified_time", 0));
                r2.A00 = Boolean.valueOf(sharedPreferences.getBoolean("registration_attempt_skip_with_no_vertical", false));
                r2.A03 = Boolean.valueOf(sharedPreferences.getBoolean("registration_retry_fetching_biz_profile", false));
                r2.A06 = registerName2.A0J;
                r2.A04 = registerName2.A0I;
                r2.A05 = registerName2.A0H;
                r2.A02 = Boolean.valueOf(registerName2.A0K);
                C007003k r1 = registerName2.A0B;
                if (r1 != null) {
                    r2.A01 = Boolean.valueOf(registerName2.A0W.A03(r1).exists());
                }
                String A0E = r12.A0E();
                try {
                    UUID fromString = UUID.fromString(A0E);
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    allocate.putLong(fromString.getMostSignificantBits());
                    allocate.putLong(fromString.getLeastSignificantBits());
                    bArr = allocate.array();
                } catch (IllegalArgumentException unused) {
                    AnonymousClass008.A17("RegistrationUtils/getBytesFromUUIDString/invalid-input ", A0E);
                    bArr = new byte[0];
                }
                r2.A09 = Base64.encodeToString(bArr, 11);
                AnonymousClass00Y r0 = registerName2.A0n;
                r0.A0B(r2, null, true);
                r0.A04();
                registerName2.A1I.ANF(new RunnableEBaseShape12S0100000_I1_7(registerName2.A1J.get(), 28));
            }
            sharedPreferences.edit().remove("message_store_verified_time").remove("eula_accepted_time").remove("registration_retry_fetching_biz_profile").remove("registration_attempt_skip_with_no_vertical").remove("registration_sibling_app_phone_number").remove("registration_sibling_app_country_code").remove("registration_sibling_app_min_storage_needed").remove("sister_app_content_provider_is_enabled").remove("direct_migration_start_time").remove("direct_db_migration_timeout_in_secs").remove("migrate_from_consumer_app_directly").remove("direct_migration_session_id").apply();
            return;
        }
        throw null;
    }

    @Override // X.DialogC26681Ly
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        getWindow().setFormat(1);
        getWindow().addFlags(4096);
        getWindow().setSoftInputMode(3);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A00(i);
        RegisterName registerName = this.A01;
        View findViewById = findViewById(R.id.pay_ed_contact_support);
        registerName.A05 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 25));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(C004302a.A00(getContext(), R.color.registration_status_bar));
            getWindow().setNavigationBarColor(C004302a.A00(getContext(), R.color.black));
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}

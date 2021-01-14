package com.whatsapp;

import X.AbstractC26811Mr;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass03S;
import X.AnonymousClass0CL;
import X.AnonymousClass0JN;
import X.AnonymousClass0JW;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass0SA;
import X.AnonymousClass1JC;
import X.AnonymousClass2C0;
import X.AnonymousClass348;
import X.C002001d;
import X.C002101e;
import X.C26881Na;
import X.C28051Sr;
import X.C40671te;
import X.C40681tf;
import X.C73193Vv;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape1S1100000_I1;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsDataUsageActivity extends AnonymousClass0SA implements AbstractC26811Mr {
    public int A00;
    public int A01;
    public int A02;
    public long A03 = -1;
    public Handler A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public SwitchCompat A0G;
    public C40681tf A0H;
    public AnonymousClass348 A0I;
    public AnonymousClass0JW A0J;
    public Timer A0K = new Timer("refresh-network-usage");
    public TimerTask A0L;
    public String[] A0M;
    public String[] A0N;
    public final AnonymousClass01I A0O = AnonymousClass01I.A00();
    public final AnonymousClass0CL A0P = AnonymousClass0CL.A00();
    public final AnonymousClass00S A0Q = AnonymousClass00S.A00();
    public final AnonymousClass03S A0R = AnonymousClass03S.A00();
    public final AnonymousClass00D A0S = AnonymousClass00D.A00();
    public final AnonymousClass00Y A0T = AnonymousClass00Y.A00();
    public final AnonymousClass0JN A0U = AnonymousClass0JN.A00();
    public final AnonymousClass00T A0V = C002101e.A00();
    public final C73193Vv A0W = C73193Vv.A00();

    public static int A04(CharSequence[] charSequenceArr) {
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            i |= 1 << Integer.parseInt(charSequence.toString());
        }
        return i;
    }

    public final String A0V(int i) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                arrayList.add(Integer.toString(i3));
            }
            i >>= 1;
            i3++;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        int length = charSequenceArr.length;
        String[] strArr = this.A0N;
        if (length == strArr.length) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.settings_autodownload_all);
        }
        if (length == 0) {
            return ((AnonymousClass2C0) this).A01.A06(R.string.settings_autodownload_none);
        }
        CharSequence charSequence = charSequenceArr[0];
        while (true) {
            if (i2 >= strArr.length) {
                str = "";
                break;
            }
            String charSequence2 = charSequence.toString();
            strArr = this.A0N;
            if (charSequence2.equals(strArr[i2])) {
                str = this.A0M[i2];
                break;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i4 = 1; i4 < length; i4++) {
            StringBuilder A0S2 = AnonymousClass008.A0S(", ");
            CharSequence charSequence3 = charSequenceArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.A0N.length) {
                    str2 = "";
                    break;
                } else if (charSequence3.toString().equals(this.A0N[i5])) {
                    str2 = this.A0M[i5];
                    break;
                } else {
                    i5++;
                }
            }
            A0S2.append(str2);
            sb.append(A0S2.toString());
        }
        return sb.toString();
    }

    public final void A0W() {
        this.A0F.setVisibility(0);
        Log.i("settings-data-usage-activity/loadStorageData");
        C40671te r1 = new C40671te(this);
        this.A0J = r1;
        AnonymousClass00T r2 = this.A0V;
        r2.ANC(r1, new Void[0]);
        C40681tf r12 = new C40681tf(this);
        this.A0H = r12;
        r2.ANC(r12, new Void[0]);
    }

    public final void A0X(String str) {
        int i;
        int i2;
        boolean[] zArr;
        if (str.equals("autodownload_cellular_mask")) {
            i = 2;
            i2 = R.string.settings_autodownload_cellular;
            int i3 = this.A00;
            zArr = new boolean[this.A0N.length];
            int i4 = 0;
            while (i3 != 0) {
                boolean z = false;
                if ((i3 & 1) != 0) {
                    z = true;
                }
                zArr[i4] = z;
                i3 >>= 1;
                i4++;
            }
        } else if (str.equals("autodownload_wifi_mask")) {
            i = 3;
            i2 = R.string.settings_autodownload_wifi;
            int i5 = this.A02;
            zArr = new boolean[this.A0N.length];
            int i6 = 0;
            while (i5 != 0) {
                boolean z2 = false;
                if ((i5 & 1) != 0) {
                    z2 = true;
                }
                zArr[i6] = z2;
                i5 >>= 1;
                i6++;
            }
        } else if (str.equals("autodownload_roaming_mask")) {
            i = 4;
            i2 = R.string.settings_autodownload_roaming;
            int i7 = this.A01;
            zArr = new boolean[this.A0N.length];
            int i8 = 0;
            while (i7 != 0) {
                boolean z3 = false;
                if ((i7 & 1) != 0) {
                    z3 = true;
                }
                zArr[i8] = z3;
                i7 >>= 1;
                i8++;
            }
        } else {
            throw new IllegalArgumentException("Invalid preference key passed in for auto download settings dialog");
        }
        MultiSelectionDialogFragment multiSelectionDialogFragment = new MultiSelectionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("dialogTitleResId", i2);
        bundle.putInt("itemsResId", R.array.autodownload);
        bundle.putBooleanArray("selectedItems", zArr);
        multiSelectionDialogFragment.A0N(bundle);
        APm(multiSelectionDialogFragment);
    }

    public /* synthetic */ void A0Y(String str) {
        if (!this.A0R.A06()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_storage_usage_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_storage_usage;
            }
            RequestPermissionActivity.A09(this, R.string.permission_storage_need_write_access_on_storage_usage_request, i2);
            return;
        }
        startActivityForResult(StorageUsageActivity.A04(this, str, 1), 1);
    }

    @Override // X.AbstractC26811Mr
    public void AHq(int i, boolean[] zArr) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                arrayList.add(this.A0N[i2]);
            }
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        if (i == 2) {
            int A042 = A04(charSequenceArr);
            this.A00 = A042;
            AnonymousClass008.A0k(this.A0S, "autodownload_cellular_mask", A042);
            this.A0C.setText(A0V(this.A00));
            this.A0U.A01();
        } else if (i == 3) {
            int A043 = A04(charSequenceArr);
            this.A02 = A043;
            AnonymousClass008.A0k(this.A0S, "autodownload_wifi_mask", A043);
            this.A0E.setText(A0V(this.A02));
            this.A0U.A01();
        } else if (i == 4) {
            int A044 = A04(charSequenceArr);
            this.A01 = A044;
            AnonymousClass008.A0k(this.A0S, "autodownload_roaming_mask", A044);
            this.A0D.setText(A0V(this.A01));
            this.A0U.A01();
            if ((this.A01 & 4) != 0) {
                C002001d.A2O(this, 1);
            }
        }
    }

    public /* synthetic */ void lambda$onCreate$1368$SettingsDataUsageActivity(View view) {
        startActivity(new Intent(this, SettingsNetworkUsage.class));
    }

    public /* synthetic */ void lambda$onCreate$1370$SettingsDataUsageActivity(View view) {
        A0X("autodownload_cellular_mask");
    }

    public /* synthetic */ void lambda$onCreate$1371$SettingsDataUsageActivity(View view) {
        A0X("autodownload_wifi_mask");
    }

    public /* synthetic */ void lambda$onCreate$1372$SettingsDataUsageActivity(View view) {
        A0X("autodownload_roaming_mask");
    }

    public void lambda$onCreate$1373$SettingsDataUsageActivity(View view) {
        this.A0G.toggle();
        AnonymousClass008.A0n(this.A0S, "voip_low_data_usage", this.A0G.isChecked());
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 151) {
            if (i2 == -1) {
                A0W();
                startActivity(new Intent(this, StorageUsageActivity.class));
                return;
            }
        } else if (i == 1) {
            A0W();
            return;
        }
        Log.i("settings-data-usage-activity/onActivityResult/storage_permission denied/cant open StorageUsageActivity");
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0I = new AnonymousClass348(this.A0Q, this.A0W);
        AnonymousClass01I r0 = this.A0O;
        r0.A04();
        if (r0.A00 == null) {
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.settings_storage_and_data_usage_enhanced));
        setContentView(R.layout.preferences_data_usage);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            this.A04 = new Handler(Looper.myLooper());
            this.A0M = getResources().getStringArray(R.array.autodownload);
            this.A0N = getResources().getStringArray(R.array.autodownload_values);
            SharedPreferences sharedPreferences = this.A0S.A00;
            this.A00 = sharedPreferences.getInt("autodownload_cellular_mask", 1);
            this.A02 = sharedPreferences.getInt("autodownload_wifi_mask", 15);
            this.A01 = sharedPreferences.getInt("autodownload_roaming_mask", 0);
            this.A09 = findViewById(R.id.setting_network_usage);
            this.A0B = (TextView) findViewById(R.id.setting_network_usage_details);
            this.A0A = findViewById(R.id.setting_storage_usage);
            this.A0F = (TextView) findViewById(R.id.setting_storage_usage_details);
            this.A05 = findViewById(R.id.setting_autodownload_cellular);
            this.A0C = (TextView) findViewById(R.id.setting_selected_autodownload_cellular);
            this.A07 = findViewById(R.id.setting_autodownload_wifi);
            this.A0E = (TextView) findViewById(R.id.setting_selected_autodownload_wifi);
            this.A06 = findViewById(R.id.setting_autodownload_roaming);
            this.A0D = (TextView) findViewById(R.id.setting_selected_autodownload_roaming);
            this.A08 = findViewById(R.id.settings_calls_low_data);
            this.A0G = (SwitchCompat) findViewById(R.id.low_data_calls_switch);
            this.A09.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 45));
            this.A0A.setOnClickListener(new ViewOnClickEBaseShape1S1100000_I1(this, C28051Sr.A0o(1, this.A0T), 0));
            this.A0C.setText(A0V(this.A00));
            this.A05.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 46));
            this.A0E.setText(A0V(this.A02));
            this.A07.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 48));
            this.A0D.setText(A0V(this.A01));
            this.A06.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 44));
            this.A0G.setChecked(sharedPreferences.getBoolean("voip_low_data_usage", false));
            this.A08.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 47));
            if (this.A0R.A06()) {
                A0W();
            } else {
                this.A0F.setVisibility(8);
            }
        } else {
            throw null;
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        r3.A01.A0E = r2.A06(R.string.settings_autodownload_roaming_warning);
        r3.A07(r2.A06(R.string.ok), AnonymousClass1JC.A00);
        return r3.A00();
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0K.cancel();
        AnonymousClass0JW r0 = this.A0J;
        if (r0 != null) {
            r0.A00.cancel(true);
        }
        C40681tf r1 = this.A0H;
        if (r1 != null) {
            r1.A00.set(true);
            ((AnonymousClass0JW) r1).A00.cancel(true);
        }
        this.A03 = -1;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A0L.cancel();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C26881Na r1 = new C26881Na(this);
        this.A0L = r1;
        this.A0K.scheduleAtFixedRate(r1, 0, 1000);
    }
}

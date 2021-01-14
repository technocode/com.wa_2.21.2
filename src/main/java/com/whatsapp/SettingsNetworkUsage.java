package com.whatsapp;

import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass0CL;
import X.AnonymousClass0HQ;
import X.AnonymousClass0MB;
import X.AnonymousClass0OV;
import X.AnonymousClass0OY;
import X.AnonymousClass0OZ;
import X.AnonymousClass0QV;
import X.AnonymousClass0S2;
import X.AnonymousClass1JN;
import X.C001801b;
import X.C002001d;
import X.C003701u;
import X.C26901Nc;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I1_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsNetworkUsage extends ActivityC004602e {
    public Handler A00;
    public TimerTask A01;
    public final AnonymousClass0CL A02 = AnonymousClass0CL.A00();
    public final AnonymousClass0HQ A03 = AnonymousClass0HQ.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final Timer A05 = new Timer("refresh-network-usage");

    public class ResetUsageConfirmationDialog extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r3 = this.A00;
            String A06 = r3.A06(R.string.settings_network_usage_reset_prompt);
            AnonymousClass0MB r2 = new AnonymousClass0MB(A01());
            r2.A01.A0E = A06;
            r2.A07(r3.A06(R.string.reset), new AnonymousClass1JN(this));
            return AnonymousClass008.A03(r3, R.string.cancel, r2);
        }
    }

    public final void A0T(long j, long j2, long j3, int i, int i2, int i3) {
        TextView textView = (TextView) findViewById(i);
        AnonymousClass01X r5 = this.A04;
        String A1b = C002001d.A1b(r5, j);
        textView.setText(A1b);
        int i4 = 0;
        textView.setContentDescription(r5.A0D(R.string.settings_data_network_usage_amount_sent, r5.A0E(A1b)));
        TextView textView2 = (TextView) findViewById(i2);
        String A1b2 = C002001d.A1b(r5, j2);
        textView2.setText(A1b2);
        textView2.setContentDescription(r5.A0D(R.string.settings_data_network_usage_amount_received, r5.A0E(A1b2)));
        if (j3 > 0) {
            i4 = (int) ((((float) (j + j2)) * 100.0f) / ((float) j3));
        }
        ((RoundCornerProgressBar) findViewById(i3)).setProgress(i4);
    }

    public final void A0U(boolean z) {
        String A0D;
        if (z) {
            AnonymousClass0CL r1 = this.A02;
            if (r1 != null) {
                Log.i("statistics/reset");
                AnonymousClass0QV r12 = r1.A00;
                boolean z2 = false;
                if (r12 != null) {
                    z2 = true;
                }
                AnonymousClass00E.A07(z2);
                r12.sendEmptyMessage(9);
            } else {
                throw null;
            }
        }
        Statistics$Data A012 = this.A02.A01();
        AnonymousClass01X r13 = this.A04;
        NumberFormat instance = NumberFormat.getInstance(r13.A0I());
        long j = A012.tx_media_bytes + A012.tx_message_service_bytes + A012.tx_voip_bytes + A012.tx_google_drive_bytes + A012.tx_status_bytes;
        long j2 = A012.rx_media_bytes + A012.rx_message_service_bytes + A012.rx_voip_bytes + A012.rx_google_drive_bytes + A012.rx_status_bytes;
        long j3 = j + j2;
        AnonymousClass0OV A1A = C002001d.A1A(r13, j3);
        StringBuilder sb = new StringBuilder();
        String str = A1A.A01;
        sb.append(str);
        sb.append(A1A.A02);
        String str2 = A1A.A00;
        sb.append(str2);
        SpannableString spannableString = new SpannableString(sb.toString());
        if (!str.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, str.length(), 33);
        }
        if (!str2.isEmpty()) {
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), spannableString.length() - str2.length(), spannableString.length(), 33);
        }
        ((TextView) findViewById(R.id.total_network_usage)).setText(spannableString);
        ((TextView) findViewById(R.id.total_network_usage_sent)).setText(C002001d.A1b(r13, j));
        ((TextView) findViewById(R.id.total_network_usage_received)).setText(C002001d.A1b(r13, j2));
        A0T(A012.tx_voip_bytes, A012.rx_voip_bytes, j3, R.id.call_data_sent, R.id.call_data_received, R.id.calls_data_bar);
        long j4 = A012.tx_voip_calls;
        long j5 = A012.rx_voip_calls;
        ((TextView) findViewById(R.id.calls_info)).setText(C003701u.A02(r13, r13.A0A(R.plurals.settings_network_usage_calls_info_outgoing, j4, instance.format(j4)), r13.A0A(R.plurals.settings_network_usage_calls_info_incoming, j5, instance.format(j5))));
        A0T(A012.tx_media_bytes, A012.rx_media_bytes, j3, R.id.media_data_sent, R.id.media_data_received, R.id.media_data_bar);
        long j6 = A012.tx_google_drive_bytes;
        long j7 = A012.rx_google_drive_bytes;
        if (this.A03.A06() || j6 > 0 || j7 > 0) {
            A0T(j6, j7, j3, R.id.gdrive_data_sent, R.id.gdrive_data_received, R.id.gdrive_data_bar);
        } else {
            findViewById(R.id.gdrive_row).setVisibility(8);
        }
        A0T(A012.tx_message_service_bytes, A012.rx_message_service_bytes, j3, R.id.messages_data_sent, R.id.messages_data_received, R.id.messages_data_bar);
        long j8 = A012.tx_text_msgs + A012.tx_media_msgs;
        long j9 = A012.rx_text_msgs + A012.rx_media_msgs;
        ((TextView) findViewById(R.id.messages_info)).setText(C003701u.A02(r13, r13.A0A(R.plurals.settings_network_usage_messages_info_sent, j8, instance.format(j8)), r13.A0A(R.plurals.settings_network_usage_messages_info_received, j9, instance.format(j9))));
        A0T(A012.tx_status_bytes, A012.rx_status_bytes, j3, R.id.status_data_sent, R.id.status_data_received, R.id.status_data_bar);
        long j10 = A012.tx_statuses;
        long j11 = A012.rx_statuses;
        ((TextView) findViewById(R.id.status_info)).setText(C003701u.A02(r13, r13.A0A(R.plurals.settings_network_usage_status_info_sent, j10, instance.format(j10)), r13.A0A(R.plurals.settings_network_usage_status_info_received, j11, instance.format(j11))));
        A0T(A012.tx_roaming_bytes, A012.rx_roaming_bytes, j3, R.id.roaming_data_sent, R.id.roaming_data_received, R.id.roaming_data_bar);
        long j12 = A012.last_reset;
        if (j12 != Long.MIN_VALUE) {
            findViewById(R.id.last_updated_date).setVisibility(0);
            A0D = r13.A0D(R.string.network_usage_last_reset_time, AnonymousClass0OY.A05(r13, C001801b.A0e(r13, j12), AnonymousClass0OZ.A00(r13, j12)));
            ((TextView) findViewById(R.id.last_updated_date)).setText(r13.A0D(R.string.settings_network_usages_time_since_refresh_date, C001801b.A0e(r13, j12)));
        } else {
            A0D = r13.A0D(R.string.network_usage_last_reset_time, r13.A06(R.string.never));
            findViewById(R.id.last_updated_date).setVisibility(8);
        }
        ((TextView) findViewById(R.id.last_usage_reset)).setText(A0D);
    }

    public void lambda$onCreate$1396$SettingsNetworkUsage(View view) {
        ResetUsageConfirmationDialog resetUsageConfirmationDialog = new ResetUsageConfirmationDialog();
        resetUsageConfirmationDialog.A0N(new Bundle());
        APm(resetUsageConfirmationDialog);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.A04.A06(R.string.settings_network_usage));
        setContentView(R.layout.preferences_network_usage);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            findViewById(R.id.reset_network_usage_row).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I1_1(this, 3));
            this.A00 = new Handler(Looper.myLooper());
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A05.cancel();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A01.cancel();
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C26901Nc r1 = new C26901Nc(this);
        this.A01 = r1;
        this.A05.scheduleAtFixedRate(r1, 0, 1000);
    }
}

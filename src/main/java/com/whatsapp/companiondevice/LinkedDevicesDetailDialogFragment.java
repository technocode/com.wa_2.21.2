package com.whatsapp.companiondevice;

import X.AbstractC03150Ez;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0C4;
import X.AnonymousClass0K4;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass1VI;
import X.C002001d;
import X.C02430Bz;
import X.C03130Ex;
import X.C28051Sr;
import X.C28741Vo;
import X.C51052Xd;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.Map;

public class LinkedDevicesDetailDialogFragment extends WaDialogFragment implements AbstractC03150Ez {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public AnonymousClass1VI A02;
    public C28741Vo A03;
    public AnonymousClass0K4 A04;
    public Boolean A05;
    public final AnonymousClass02M A06 = AnonymousClass02M.A00();
    public final C51052Xd A07;
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();
    public final C02430Bz A09 = C02430Bz.A00();
    public final C03130Ex A0A = C03130Ex.A00();
    public final AnonymousClass0C4 A0B = AnonymousClass0C4.A00();

    public LinkedDevicesDetailDialogFragment(AnonymousClass0K4 r2, C51052Xd r3) {
        this.A04 = r2;
        this.A07 = r3;
    }

    public LinkedDevicesDetailDialogFragment(AnonymousClass1VI r2, C51052Xd r3) {
        this.A02 = r2;
        this.A07 = r3;
    }

    public LinkedDevicesDetailDialogFragment(C28741Vo r2, C51052Xd r3) {
        this.A03 = r2;
        this.A07 = r3;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        this.A01 = LayoutInflater.from(A00()).inflate(R.layout.linked_devices_detail_dialog, (ViewGroup) null, false);
        this.A05 = null;
        C03130Ex r4 = this.A0A;
        r4.A02.execute(new RunnableEBaseShape2S0300000_I1(r4, this, this.A06.A06, 26));
        A0x();
        AnonymousClass0MB r2 = new AnonymousClass0MB(A0A());
        View view = this.A01;
        AnonymousClass0MC r1 = r2.A01;
        r1.A0C = view;
        r1.A01 = 0;
        return r2.A00();
    }

    public final void A0x() {
        CharSequence A1E;
        CharSequence A1E2;
        String str;
        CharSequence A1E3;
        AnonymousClass0K4 r0 = this.A04;
        if (r0 != null) {
            boolean A0J = this.A0B.A0J(r0.A0I);
            AnonymousClass0K4 r02 = this.A04;
            AnonymousClass01X r2 = this.A08;
            String A11 = C28051Sr.A11(r02, r2);
            AnonymousClass0K4 r03 = this.A04;
            int A0A2 = C28051Sr.A0A(r03);
            long j = r03.A05;
            if (A0J) {
                A1E3 = r2.A06(R.string.linked_device_active_now);
            } else {
                A1E3 = C002001d.A1E(r2, j);
            }
            A0y(A11, A0A2, A1E3, A0J, this.A04.A0A, new ViewOnClickEBaseShape4S0100000_I1_2(this, 48), true, A0F(R.string.log_out), null);
            return;
        }
        AnonymousClass1VI r1 = this.A02;
        if (r1 != null) {
            C02430Bz r04 = this.A09;
            boolean contains = r04.A0J.contains(r1.A05);
            AnonymousClass1VI r05 = this.A02;
            AnonymousClass01X r22 = this.A08;
            String A0x = C28051Sr.A0x(r05, r22);
            AnonymousClass1VI r06 = this.A02;
            int A062 = C28051Sr.A06(r06);
            long j2 = r06.A00;
            if (contains) {
                A1E2 = r22.A06(R.string.linked_device_active_now);
            } else {
                A1E2 = C002001d.A1E(r22, j2);
            }
            AnonymousClass1VI r12 = this.A02;
            String str2 = r12.A02;
            ViewOnClickEBaseShape4S0100000_I1_2 viewOnClickEBaseShape4S0100000_I1_2 = new ViewOnClickEBaseShape4S0100000_I1_2(this, 46);
            boolean z = false;
            if (r12.A01 > 0) {
                z = true;
            }
            int i = R.string.log_out;
            if (z) {
                i = R.string.linked_device_remove;
            }
            String A0F = A0F(i);
            boolean z2 = false;
            if (this.A02.A01 > 0) {
                z2 = true;
            }
            if (z2) {
                str = A02().getString(R.string.linked_device_logged_out_helper_text, 30);
            } else {
                str = null;
            }
            A0y(A0x, A062, A1E2, contains, str2, viewOnClickEBaseShape4S0100000_I1_2, z, A0F, str);
            return;
        }
        C28741Vo r13 = this.A03;
        if (r13 == null) {
            return;
        }
        if (A00() != null) {
            String A0F2 = A0F(r13.A01);
            C28741Vo r07 = this.A03;
            int i2 = r07.A00;
            AnonymousClass01X r7 = this.A08;
            long j3 = r07.A02;
            if (System.currentTimeMillis() - j3 <= 30000) {
                A1E = r7.A06(R.string.linked_device_active_now);
            } else {
                A1E = C002001d.A1E(r7, j3);
            }
            A0y(A0F2, i2, A1E, true, null, new ViewOnClickEBaseShape4S0100000_I1_2(this, 45), true, A0F(R.string.unlink), null);
            return;
        }
        throw null;
    }

    public final void A0y(String str, int i, CharSequence charSequence, boolean z, String str2, View.OnClickListener onClickListener, boolean z2, String str3, String str4) {
        View view = this.A01;
        if (view != null) {
            ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(view, R.id.device_icon);
            View A0D = AnonymousClass0Q7.A0D(this.A01, R.id.status_icon);
            View A0D2 = AnonymousClass0Q7.A0D(this.A01, R.id.location_container);
            View A0D3 = AnonymousClass0Q7.A0D(this.A01, R.id.location_icon);
            TextView textView = (TextView) AnonymousClass0Q7.A0D(this.A01, R.id.location_text);
            View A0D4 = AnonymousClass0Q7.A0D(this.A01, R.id.sync_container);
            View A0D5 = AnonymousClass0Q7.A0D(this.A01, R.id.sync_icon);
            TextView textView2 = (TextView) AnonymousClass0Q7.A0D(this.A01, R.id.sync_text);
            TextView textView3 = (TextView) AnonymousClass0Q7.A0D(this.A01, R.id.logout_text);
            View A0D6 = AnonymousClass0Q7.A0D(this.A01, R.id.close_text);
            TextView textView4 = (TextView) AnonymousClass0Q7.A0D(this.A01, R.id.logged_out_device_hint);
            ((TextView) AnonymousClass0Q7.A0D(this.A01, R.id.device_name_text)).setText(str);
            imageView.setImageResource(i);
            C28051Sr.A1T(imageView, z2);
            ((TextView) AnonymousClass0Q7.A0D(this.A01, R.id.status_text)).setText(charSequence);
            int i2 = R.drawable.linked_devices_detail_icon_inactive_background;
            if (z) {
                i2 = R.drawable.linked_devices_detail_icon_active_background;
            }
            A0D.setBackgroundResource(i2);
            int i3 = 0;
            if (!TextUtils.isEmpty(str2)) {
                A0D2.setVisibility(0);
                textView.setText(A02().getString(R.string.linked_device_location, str2));
                int i4 = R.drawable.linked_devices_detail_icon_inactive_background;
                if (z) {
                    i4 = R.drawable.linked_devices_detail_icon_active_background;
                }
                A0D3.setBackgroundResource(i4);
            } else {
                A0D2.setVisibility(8);
            }
            if (this.A05 != null) {
                A0D4.setVisibility(0);
                boolean booleanValue = this.A05.booleanValue();
                int i5 = R.string.linked_device_not_syncing;
                if (booleanValue) {
                    i5 = R.string.linked_device_syncing;
                }
                textView2.setText(i5);
                boolean booleanValue2 = this.A05.booleanValue();
                int i6 = R.drawable.linked_devices_detail_icon_inactive_background;
                if (booleanValue2) {
                    i6 = R.drawable.linked_devices_detail_icon_active_background;
                }
                A0D5.setBackgroundResource(i6);
            } else {
                A0D4.setVisibility(8);
            }
            if (str4 == null) {
                i3 = 8;
            }
            textView4.setVisibility(i3);
            if (str4 != null) {
                textView4.setText(str4);
            }
            textView3.setText(str3);
            textView3.setOnClickListener(onClickListener);
            A0D6.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 47));
            return;
        }
        throw null;
    }

    @Override // X.AbstractC03150Ez
    public void A1e(Object obj) {
        boolean booleanValue;
        Map map = (Map) obj;
        AnonymousClass1VI r0 = this.A02;
        if (r0 != null) {
            Boolean bool = (Boolean) map.get(r0.A05);
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            this.A05 = Boolean.valueOf(booleanValue);
            A0x();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.A0A.A00.A02(this);
    }
}

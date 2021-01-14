package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3Gk  reason: invalid class name and case insensitive filesystem */
public class C69273Gk extends AnonymousClass0JW {
    public final /* synthetic */ IndiaUpiDeviceBindActivity A00;

    public C69273Gk(IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity) {
        this.A00 = indiaUpiDeviceBindActivity;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity;
        List<SubscriptionInfo> list;
        if (Build.VERSION.SDK_INT >= 22) {
            IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity2 = this.A00;
            indiaUpiDeviceBindActivity = indiaUpiDeviceBindActivity2;
            if (indiaUpiDeviceBindActivity2.A0K.A02("android.permission.READ_PHONE_STATE") == 0) {
                list = SubscriptionManager.from(indiaUpiDeviceBindActivity2).getActiveSubscriptionInfoList();
                C018809u r2 = indiaUpiDeviceBindActivity.A0T;
                StringBuilder A0S = AnonymousClass008.A0S("educateAndSendDeviceBinding found sdk version: ");
                A0S.append(Build.VERSION.SDK_INT);
                A0S.append(" subscription info: ");
                A0S.append(list);
                r2.A07(null, A0S.toString(), null);
                return list;
            }
        }
        indiaUpiDeviceBindActivity = this.A00;
        indiaUpiDeviceBindActivity.A0T.A07(null, "educateAndSendDeviceBinding read_phone_state permission not granted", null);
        list = null;
        C018809u r22 = indiaUpiDeviceBindActivity.A0T;
        StringBuilder A0S2 = AnonymousClass008.A0S("educateAndSendDeviceBinding found sdk version: ");
        A0S2.append(Build.VERSION.SDK_INT);
        A0S2.append(" subscription info: ");
        A0S2.append(list);
        r22.A07(null, A0S2.toString(), null);
        return list;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int i;
        String str;
        FrameLayout frameLayout;
        TextView textView;
        TextView textView2;
        View view;
        ImageView imageView;
        List list = (List) obj;
        synchronized (this) {
            this.A00.A0B = null;
            char c = 0;
            if (list == null) {
                i = 0;
            } else {
                i = list.size();
            }
            C018809u r2 = this.A00.A0T;
            StringBuilder sb = new StringBuilder();
            sb.append("num of sims detected: ");
            sb.append(i);
            r2.A07(null, sb.toString(), null);
            C60922sD r1 = this.A00.A0L;
            int i2 = 1;
            boolean z = false;
            if (i > 1) {
                z = true;
            }
            r1.A05 = Boolean.valueOf(z);
            if (list == null || list.size() == 1) {
                this.A00.A0e();
            } else if (Build.VERSION.SDK_INT >= 22) {
                int i3 = 2;
                if (list.size() == 2) {
                    if (this.A00 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("airtel", Integer.valueOf((int) R.drawable.mob_airtel));
                        hashMap.put("aircel", Integer.valueOf((int) R.drawable.mob_aircel));
                        hashMap.put("bsnl", Integer.valueOf((int) R.drawable.mob_bsnl));
                        hashMap.put("idea", Integer.valueOf((int) R.drawable.mob_idea));
                        hashMap.put("jio", Integer.valueOf((int) R.drawable.mob_jio));
                        hashMap.put("mtnl", Integer.valueOf((int) R.drawable.mob_mtnl));
                        hashMap.put("nttdocomo", Integer.valueOf((int) R.drawable.mob_nttdocomo));
                        hashMap.put("reliance", Integer.valueOf((int) R.drawable.mob_reliance));
                        hashMap.put("telenor", Integer.valueOf((int) R.drawable.mob_telenor));
                        hashMap.put("vodafone", Integer.valueOf((int) R.drawable.mob_vodafone));
                        int i4 = 0;
                        do {
                            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) list.get(i4);
                            AnonymousClass01I r0 = this.A00.A0I;
                            r0.A04();
                            UserJid userJid = r0.A03;
                            String number = subscriptionInfo.getNumber();
                            if (!(number == null || userJid == null)) {
                                String replaceAll = number.replaceAll("\\D", "");
                                if (C001801b.A0X(this.A00.A0H, C001801b.A12(userJid.user), replaceAll).equalsIgnoreCase(userJid.user)) {
                                    this.A00.A01 = subscriptionInfo.getSubscriptionId();
                                    this.A00.A0e();
                                    return;
                                }
                            }
                            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                            C018809u r22 = this.A00.A0T;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("educateAndSendDeviceBinding setting sim slot: ");
                            sb2.append(simSlotIndex);
                            sb2.append(": ");
                            sb2.append(subscriptionInfo);
                            r22.A07(null, sb2.toString(), null);
                            if (simSlotIndex == 0) {
                                textView = (TextView) this.A00.findViewById(R.id.sim1_label);
                                AnonymousClass01X r8 = ((AnonymousClass2C0) this.A00).A01;
                                Object[] objArr = new Object[i2];
                                objArr[c] = Integer.valueOf(i2);
                                str = r8.A0D(R.string.sim_1_with_placeholder, objArr);
                                textView2 = (TextView) this.A00.findViewById(R.id.carrier_name_sim1);
                                view = this.A00.findViewById(R.id.sim_1_container);
                                imageView = (ImageView) this.A00.findViewById(R.id.sim1_drawable);
                                frameLayout = (FrameLayout) this.A00.findViewById(R.id.sim1_drawable_container);
                            } else {
                                if (simSlotIndex == i2) {
                                    textView = (TextView) this.A00.findViewById(R.id.sim2_label);
                                    AnonymousClass01X r82 = ((AnonymousClass2C0) this.A00).A01;
                                    Object[] objArr2 = new Object[i2];
                                    objArr2[c] = Integer.valueOf(i3);
                                    str = r82.A0D(R.string.sim_2_with_placeholder, objArr2);
                                    textView2 = (TextView) this.A00.findViewById(R.id.carrier_name_sim2);
                                    view = this.A00.findViewById(R.id.sim_2_container);
                                    imageView = (ImageView) this.A00.findViewById(R.id.sim2_drawable);
                                    frameLayout = (FrameLayout) this.A00.findViewById(R.id.sim2_drawable_container);
                                }
                                i4++;
                                c = 0;
                                i3 = 2;
                                i2 = 1;
                            }
                            if (!(textView2 == null || view == null)) {
                                textView.setText(str);
                                textView2.setText(subscriptionInfo.getDisplayName());
                                HashMap hashMap2 = hashMap;
                                Iterator it = hashMap2.keySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        frameLayout.setBackground(this.A00.getDrawable(R.drawable.ic_hero_sim));
                                        break;
                                    }
                                    String str2 = (String) it.next();
                                    C018809u r12 = this.A00.A0T;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Searching drawable map for operator/carrier name ");
                                    sb3.append(str2);
                                    sb3.append(" ");
                                    sb3.append((Object) textView2.getText());
                                    r12.A07(null, sb3.toString(), null);
                                    if (str2.contains(textView2.getText().toString().toLowerCase(Locale.US))) {
                                        Drawable background = frameLayout.getBackground();
                                        background.setTint(C004302a.A00(this.A00, R.color.body_light_gray));
                                        frameLayout.setBackground(background);
                                        imageView.setImageDrawable(this.A00.getDrawable(((Integer) hashMap2.get(str2)).intValue()));
                                        C018809u r23 = this.A00.A0T;
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("Found drawable for operator/carrier name ");
                                        sb4.append(str2);
                                        sb4.append(" ");
                                        sb4.append((Object) textView2.getText());
                                        r23.A07(null, sb4.toString(), null);
                                        break;
                                    }
                                }
                                IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = this.A00;
                                int subscriptionId = subscriptionInfo.getSubscriptionId();
                                if (indiaUpiDeviceBindActivity != null) {
                                    view.setOnClickListener(new View$OnClickListenerC62352ue(indiaUpiDeviceBindActivity, subscriptionId, i4));
                                } else {
                                    throw null;
                                }
                            }
                            i4++;
                            c = 0;
                            i3 = 2;
                            i2 = 1;
                        } while (i4 < 2);
                        this.A00.A04.setVisibility(8);
                        this.A00.A03.setVisibility(8);
                        this.A00.findViewById(R.id.progress).setVisibility(8);
                        TextView textView3 = (TextView) this.A00.findViewById(R.id.payments_sms_education_dual_sim);
                        AnonymousClass01I r02 = this.A00.A0I;
                        r02.A04();
                        AnonymousClass0HR r03 = r02.A01;
                        if (r03 != null) {
                            String A002 = C12420i4.A00(r03);
                            if (A002 != null) {
                                textView3.setText(((AnonymousClass2C0) this.A00).A01.A0D(R.string.payments_sms_education_dual_sim, A002));
                            }
                            this.A00.findViewById(R.id.dual_sim_picker).setVisibility(0);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }
}

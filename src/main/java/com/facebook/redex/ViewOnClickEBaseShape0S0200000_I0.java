package com.facebook.redex;

import X.AbstractC007503q;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0JW;
import X.AnonymousClass0M9;
import X.AnonymousClass0QH;
import X.AnonymousClass0Y5;
import X.AnonymousClass2C0;
import X.AnonymousClass2CD;
import X.C004302a;
import X.C007003k;
import X.C03190Fd;
import X.C04090Iz;
import X.C08290ao;
import X.C08300aq;
import X.C10300eP;
import X.C11980hM;
import X.C12000hO;
import X.C28051Sr;
import X.C68753Ek;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.DescribeProblemActivity;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.List;

public class ViewOnClickEBaseShape0S0200000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickEBaseShape0S0200000_I0(C08290ao r4) {
        this.A02 = 0;
        this.A01 = r4;
        this.A00 = new C08300aq(r4.A09.getContext(), ((C08290ao) this.A01).A0C);
    }

    public ViewOnClickEBaseShape0S0200000_I0(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onClick(View view) {
        List list;
        switch (this.A02) {
            case 0:
                C08290ao r0 = (C08290ao) this.A01;
                Window.Callback callback = r0.A07;
                if (callback != null && r0.A0D) {
                    callback.onMenuItemSelected(0, (C08300aq) this.A00);
                    return;
                }
                return;
            case 1:
                DescribeProblemActivity describeProblemActivity = (DescribeProblemActivity) this.A00;
                TextView textView = (TextView) this.A01;
                int length = describeProblemActivity.A0T().getBytes().length;
                if (describeProblemActivity.A08 || length >= 10) {
                    describeProblemActivity.A01.setBackgroundDrawable(C004302a.A03(describeProblemActivity, R.drawable.describe_problem_edittext_state_list));
                    textView.setVisibility(8);
                    int i = describeProblemActivity.A00;
                    if (i == 2 || i == 3 || "voip-dev@whatsapp.com".equals(describeProblemActivity.A05) || C28051Sr.A1x(describeProblemActivity.A06)) {
                        describeProblemActivity.A0U();
                        return;
                    }
                    AnonymousClass00T r1 = describeProblemActivity.A0I;
                    C10300eP r02 = describeProblemActivity.A03;
                    if (r02 != null && ((AnonymousClass0JW) r02).A00.getStatus() == AsyncTask.Status.RUNNING) {
                        ((AnonymousClass0JW) describeProblemActivity.A03).A00.cancel(false);
                    }
                    C03190Fd r6 = describeProblemActivity.A0G;
                    AnonymousClass0M9 r7 = describeProblemActivity.A0D;
                    AnonymousClass01X r8 = ((AnonymousClass2C0) describeProblemActivity).A01;
                    C04090Iz r9 = describeProblemActivity.A0B;
                    AnonymousClass00C r10 = describeProblemActivity.A0C;
                    AnonymousClass00D r11 = describeProblemActivity.A0J;
                    String str = describeProblemActivity.A06;
                    String str2 = describeProblemActivity.A07;
                    C68753Ek r03 = describeProblemActivity.A04;
                    if (r03 != null) {
                        list = r03.A00();
                    } else {
                        list = null;
                    }
                    C10300eP r4 = new C10300eP(describeProblemActivity, r6, r7, r8, r9, r10, r11, describeProblemActivity, str, str2, list, describeProblemActivity.A0T(), describeProblemActivity.A09);
                    describeProblemActivity.A03 = r4;
                    r1.ANC(r4, new Void[0]);
                    return;
                }
                describeProblemActivity.A01.setBackgroundDrawable(C004302a.A03(describeProblemActivity, R.drawable.describe_problem_edittext_bg_error));
                if (length == 0) {
                    textView.setText(((AnonymousClass2C0) describeProblemActivity).A01.A06(R.string.describe_problem_description));
                } else {
                    textView.setText(((AnonymousClass2C0) describeProblemActivity).A01.A06(R.string.describe_problem_description_further));
                }
                textView.setVisibility(0);
                return;
            case 2:
                Context context = (Context) this.A00;
                context.startActivity(new Intent(context, (Class) this.A01));
                return;
            case 3:
                AnonymousClass0QH r3 = (AnonymousClass0QH) this.A00;
                C007003k r2 = (C007003k) this.A01;
                if (r3.A0O.A0H((UserJid) r2.A02(UserJid.class))) {
                    r3.A0j(r2);
                    return;
                } else {
                    r3.A0i(r2);
                    return;
                }
            case 4:
                ((C11980hM) this.A00).A06.AED((AnonymousClass2CD) this.A01);
                return;
            case 5:
                C11980hM r04 = (C11980hM) this.A00;
                r04.A06.AEA((AnonymousClass02N) this.A01, r04.A0C);
                return;
            case 6:
                C11980hM r05 = (C11980hM) this.A00;
                AnonymousClass0Y5 r22 = r05.A06;
                ViewHolder viewHolder = r05.A0C;
                r22.AEB((AnonymousClass02N) this.A01, viewHolder.A05, viewHolder.A0J);
                return;
            case 7:
                C12000hO r06 = (C12000hO) this.A00;
                r06.A04.AEC((AbstractC007503q) this.A01, r06.A0C);
                return;
            case 8:
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = (GroupCallParticipantPickerSheet) this.A00;
                PointF pointF = (PointF) this.A01;
                if (groupCallParticipantPickerSheet.A04.getVisibility() != 0 && pointF.y < groupCallParticipantPickerSheet.A03.getY()) {
                    groupCallParticipantPickerSheet.A08.A0D(5);
                    return;
                }
                return;
            case 9:
                ((VoipActivityV2) this.A00).A18((UserJid) this.A01);
                return;
            case 10:
                ((View.OnClickListener) this.A01).onClick(view);
                ((VoipActivityV2) this.A00).A0f();
                return;
            default:
                return;
        }
    }
}

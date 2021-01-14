package com.facebook.redex;

import X.AnonymousClass02N;
import X.C007003k;
import X.C09480d1;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.ArrayList;
import java.util.List;

public class ViewOnClickEBaseShape0S0300000_I0 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickEBaseShape0S0300000_I0(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                C09480d1 r4 = (C09480d1) this.A00;
                AnonymousClass02N r7 = (AnonymousClass02N) this.A01;
                Object obj = this.A02;
                r4.A07.A03(r7, false);
                r4.A0C.A01(4, r7, 0, 0);
                if (obj != null) {
                    r4.A0E.ANF(new RunnableEBaseShape0S0300000_I0_0(r4, r7, obj, 22));
                    return;
                }
                return;
            case 1:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                List<AnonymousClass02N> list = (List) this.A01;
                CallInfo callInfo = (CallInfo) this.A02;
                View view2 = voipActivityV2.A0K;
                if (view2 != null) {
                    view2.setVisibility(8);
                    Log.i("VoipActivityV2 vm call back onclick");
                    ArrayList arrayList = new ArrayList();
                    for (AnonymousClass02N r1 : list) {
                        C007003k A09 = voipActivityV2.A1V.A09(r1);
                        if (A09 != null) {
                            arrayList.add(A09);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        voipActivityV2.A1j.A02(arrayList, voipActivityV2, 4, false, callInfo.videoEnabled, null);
                        return;
                    }
                    return;
                }
                throw null;
            default:
                return;
        }
    }
}

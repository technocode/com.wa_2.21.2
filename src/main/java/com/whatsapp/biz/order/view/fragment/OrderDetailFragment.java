package com.whatsapp.biz.order.view.fragment;

import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass09H;
import X.AnonymousClass0M5;
import X.AnonymousClass0O5;
import X.AnonymousClass0OS;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QU;
import X.AnonymousClass0SD;
import X.AnonymousClass1S0;
import X.AnonymousClass1SE;
import X.AnonymousClass1SF;
import X.AnonymousClass1SM;
import X.AnonymousClass1SO;
import X.AnonymousClass1SP;
import X.AnonymousClass1SQ;
import X.AnonymousClass1SY;
import X.C002101e;
import X.C02270Bi;
import X.C27831Rq;
import X.C27881Ry;
import X.C42551wt;
import X.C42581ww;
import X.C42591wx;
import X.C42601wy;
import X.C42611wz;
import X.C42621x0;
import X.C42631x1;
import X.C460327p;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Future;

public class OrderDetailFragment extends RoundedBottomSheetDialogFragment {
    public View A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public RecyclerView A05;
    public AnonymousClass1S0 A06;
    public C42611wz A07;
    public C460327p A08;
    public UserJid A09;
    public String A0A;
    public final AnonymousClass01I A0B = AnonymousClass01I.A00();
    public final C27831Rq A0C;
    public final C27881Ry A0D;
    public final AnonymousClass1SE A0E;
    public final AnonymousClass1SF A0F;
    public final AnonymousClass00S A0G = AnonymousClass00S.A00();
    public final AnonymousClass01X A0H;
    public final AnonymousClass09H A0I;
    public final AnonymousClass00T A0J = C002101e.A00();

    public OrderDetailFragment() {
        if (AnonymousClass1SE.A01 == null) {
            synchronized (AnonymousClass1SE.class) {
                if (AnonymousClass1SE.A01 == null) {
                    AnonymousClass1SE.A01 = new AnonymousClass1SE();
                }
            }
        }
        this.A0E = AnonymousClass1SE.A01;
        this.A0I = AnonymousClass09H.A01();
        this.A0H = AnonymousClass01X.A00();
        this.A0D = C27881Ry.A00();
        if (AnonymousClass1SF.A02 == null) {
            synchronized (AnonymousClass1SF.class) {
                if (AnonymousClass1SF.A02 == null) {
                    AnonymousClass1SF.A02 = new AnonymousClass1SF(C002101e.A00());
                }
            }
        }
        this.A0F = AnonymousClass1SF.A02;
        this.A0C = C27831Rq.A00();
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Object obj;
        View inflate = layoutInflater.inflate(R.layout.fragment_order_detail, viewGroup, false);
        inflate.findViewById(R.id.order_detail_close_btn).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 24));
        this.A03 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.order_detail_quantity);
        this.A02 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.order_detail_estimate_value);
        this.A01 = (ProgressBar) AnonymousClass0Q7.A0D(inflate, R.id.order_detail_loading_spinner);
        this.A00 = AnonymousClass0Q7.A0D(inflate, R.id.order_detail_timestamp_divider);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0Q7.A0D(inflate, R.id.order_detail_recycler_view);
        this.A05 = recyclerView;
        recyclerView.A0i = true;
        AnonymousClass0Q7.A0h(recyclerView, false);
        this.A04 = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.order_detail_timestamp);
        inflate.setMinimumHeight(A0x());
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("extra_key_seller_jid");
            if (parcelable != null) {
                this.A09 = (UserJid) parcelable;
                Bundle bundle3 = ((AnonymousClass037) this).A06;
                if (bundle3 != null) {
                    String string2 = bundle3.getString("extra_key_order_id");
                    if (string2 != null) {
                        this.A0A = string2;
                        Bundle bundle4 = ((AnonymousClass037) this).A06;
                        if (bundle4 != null) {
                            String string3 = bundle4.getString("extra_key_token");
                            if (string3 != null) {
                                AnonymousClass1SM r5 = new AnonymousClass1SM(this.A09, this.A0A, A02().getDimensionPixelSize(R.dimen.order_message_thumbnail_width), A02().getDimensionPixelSize(R.dimen.order_message_thumbnail_height), string3);
                                AnonymousClass1SP r16 = new AnonymousClass1SP(this.A0J, this.A0E, r5, this.A0F, new C42551wt(this.A0I, r5, new AnonymousClass1SO(new AnonymousClass1SY())));
                                AnonymousClass00S r52 = this.A0G;
                                Context A002 = A00();
                                AnonymousClass1SQ r12 = new AnonymousClass1SQ();
                                UserJid userJid = this.A09;
                                AnonymousClass01I r2 = this.A0B;
                                AnonymousClass01X r4 = this.A0H;
                                C42621x0 r9 = new C42621x0(r52, A002, r12, userJid, r2, r4, r16);
                                AnonymousClass0O5 A9n = A9n();
                                String canonicalName = C42611wz.class.getCanonicalName();
                                if (canonicalName != null) {
                                    String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                                    HashMap hashMap = A9n.A00;
                                    AnonymousClass0SD r3 = (AnonymousClass0SD) hashMap.get(A0K);
                                    if (!C42611wz.class.isInstance(r3)) {
                                        r3 = r9.A3B(C42611wz.class);
                                        AnonymousClass0SD r22 = (AnonymousClass0SD) hashMap.put(A0K, r3);
                                        if (r22 != null) {
                                            r22.A00();
                                        }
                                    }
                                    C42611wz r32 = (C42611wz) r3;
                                    this.A07 = r32;
                                    r32.A01.A03(A0E(), new C42601wy(this));
                                    this.A07.A00.A03(A0E(), new C42581ww(this));
                                    TextView textView = (TextView) AnonymousClass0Q7.A0D(inflate, R.id.order_detail_title);
                                    C42611wz r6 = this.A07;
                                    boolean A092 = r6.A03.A09(r6.A08);
                                    Context context = r6.A02;
                                    if (A092) {
                                        string = context.getString(R.string.received_cart);
                                    } else {
                                        string = context.getString(R.string.your_sent_cart);
                                    }
                                    textView.setText(string);
                                    C42631x1 r7 = new C42631x1(A0B().getApplication(), r4);
                                    AnonymousClass0O5 A9n2 = A9n();
                                    String canonicalName2 = C460327p.class.getCanonicalName();
                                    if (canonicalName2 != null) {
                                        String A0K2 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName2);
                                        HashMap hashMap2 = A9n2.A00;
                                        Object obj2 = (AnonymousClass0SD) hashMap2.get(A0K2);
                                        if (!C460327p.class.isInstance(obj2)) {
                                            obj2 = new C460327p(r7.A00, r7.A01);
                                            AnonymousClass0SD r23 = (AnonymousClass0SD) hashMap2.put(A0K2, obj2);
                                            if (r23 != null) {
                                                r23.A00();
                                            }
                                        }
                                        this.A08 = (C460327p) obj2;
                                        AnonymousClass1SP r53 = this.A07.A04;
                                        AnonymousClass1SE r42 = r53.A02;
                                        Object obj3 = r42.A00.get(r53.A04.A03);
                                        if (obj3 != null) {
                                            C02270Bi r24 = r53.A00;
                                            if (r24 != null) {
                                                r24.A08(obj3);
                                            }
                                        } else {
                                            AnonymousClass1SF r62 = r53.A03;
                                            String str = r53.A04.A03;
                                            C42551wt r43 = r53.A05;
                                            synchronized (r62) {
                                                obj = (Future) r62.A00.get(str);
                                                if (obj == null) {
                                                    AnonymousClass09H r25 = r43.A03;
                                                    String A022 = r25.A02();
                                                    ArrayList arrayList = new ArrayList();
                                                    AnonymousClass1SM r8 = r43.A01;
                                                    arrayList.add(new AnonymousClass0M5("width", (AnonymousClass0OS[]) null, Integer.toString(r8.A01)));
                                                    arrayList.add(new AnonymousClass0M5("height", (AnonymousClass0OS[]) null, Integer.toString(r8.A00)));
                                                    AnonymousClass0M5 r10 = new AnonymousClass0M5("image_dimensions", null, (AnonymousClass0M5[]) arrayList.toArray(new AnonymousClass0M5[0]), null);
                                                    AnonymousClass0M5 r26 = new AnonymousClass0M5("token", (AnonymousClass0OS[]) null, r8.A04);
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(r10);
                                                    arrayList2.add(r26);
                                                    AnonymousClass0M5 r122 = new AnonymousClass0M5("order", new AnonymousClass0OS[]{new AnonymousClass0OS("op", "get", null, (byte) 0), new AnonymousClass0OS("id", r8.A03, null, (byte) 0)}, (AnonymousClass0M5[]) arrayList2.toArray(new AnonymousClass0M5[0]), null);
                                                    r25.A07(248, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("smax_id", "5", null, (byte) 0), new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r122), r43, 32000);
                                                    AnonymousClass008.A1Q(AnonymousClass008.A0S("GetOrderProtocol jid="), r8.A02);
                                                    obj = r43.A00;
                                                    r62.A00.put(str, obj);
                                                    r62.A01.ANF(new RunnableEBaseShape1S1200000_I1(r62, obj, str, 18));
                                                }
                                            }
                                            r53.A06.ANF(new RunnableEBaseShape6S0200000_I1_1(r53, obj, 43));
                                        }
                                        C42611wz r27 = this.A07;
                                        if (r27.A03.A09(r27.A08)) {
                                            this.A0C.A07(this.A0A, this.A09, 45);
                                            return inflate;
                                        }
                                        this.A0C.A04(35, null, this.A09, new C42591wx(this));
                                        return inflate;
                                    }
                                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                                }
                                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A0U = true;
        this.A06.A00();
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A06 = new AnonymousClass1S0(this.A0D);
    }

    @Override // com.whatsapp.RoundedBottomSheetDialogFragment
    public void A0y(View view) {
        super.A0y(view);
        BottomSheetBehavior.A00(view).A0J = false;
    }
}

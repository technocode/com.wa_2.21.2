package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1_1;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fn  reason: invalid class name and case insensitive filesystem */
public class C11150fn extends BaseAdapter implements Filterable {
    public Filter A00;
    public final /* synthetic */ CallsFragment A01;

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C11150fn(CallsFragment callsFragment) {
        this.A01 = callsFragment;
    }

    public int getCount() {
        return this.A01.A0A.size();
    }

    public Filter getFilter() {
        Filter filter = this.A00;
        if (filter != null) {
            return filter;
        }
        C675138x r1 = new C675138x(this.A01);
        this.A00 = r1;
        return r1;
    }

    public Object getItem(int i) {
        return this.A01.A0A.get(i);
    }

    public long getItemId(int i) {
        return (long) this.A01.A0A.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        return ((AbstractC675238y) this.A01.A0A.get(i)).A6u();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass390 r5;
        CallsFragment callsFragment;
        int i2;
        int i3;
        View view2 = view;
        CallsFragment callsFragment2 = this.A01;
        AbstractC675238y r7 = (AbstractC675238y) callsFragment2.A0A.get(i);
        int A6u = r7.A6u();
        int i4 = 0;
        if (A6u != 0) {
            if (A6u == 1 || A6u == 2) {
                if (view == null) {
                    boolean A0D = callsFragment2.A03.A0D(AbstractC000400g.A0b);
                    int i5 = R.layout.calls_row_legacy;
                    if (A0D) {
                        i5 = R.layout.calls_row;
                    }
                    view2 = callsFragment2.A0A().getLayoutInflater().inflate(i5, viewGroup, false);
                    if (A6u == 1) {
                        r5 = new C72533Tf(callsFragment2.A0Z, callsFragment2.A0I, callsFragment2.A0L, callsFragment2.A0Q, callsFragment2.A0T, callsFragment2.A05, callsFragment2, view2);
                    } else {
                        r5 = new AnonymousClass3TO(callsFragment2.A03, callsFragment2.A0Z, callsFragment2.A0I, callsFragment2.A0N, callsFragment2.A0L, callsFragment2.A0Q, callsFragment2.A0T, callsFragment2.A0S, callsFragment2.A05, callsFragment2.A04, callsFragment2, view2);
                    }
                    view2.setTag(r5);
                } else {
                    r5 = (AnonymousClass390) view2.getTag();
                }
                AnonymousClass0Q7.A0d(view2, new C72493Tb(this, r7));
                r5.A00 = r7;
            } else if (A6u != 3) {
                Log.e("callsfragment/callsadapter/getview Unknown list item type ");
                AnonymousClass00E.A08(false, "Unknown list item type");
                return null;
            } else {
                if (view == null) {
                    view2 = callsFragment2.A0A().getLayoutInflater().inflate(R.layout.joinable_calls_row, viewGroup, false);
                    r5 = new C72663Tt(callsFragment2.A03, callsFragment2, callsFragment2.A0Z, callsFragment2.A0Q, callsFragment2.A0I, callsFragment2.A0L, callsFragment2.A0S, view2, callsFragment2.A04);
                    view2.setTag(r5);
                } else {
                    r5 = (AnonymousClass390) view2.getTag();
                }
                r5.A00 = r7;
            }
            if (r5 instanceof C72663Tt) {
                C72663Tt r52 = (C72663Tt) r5;
                C11260fz r3 = ((C72513Td) ((AnonymousClass390) r52).A00).A00;
                AnonymousClass01A r10 = r52.A05;
                C014308b r11 = r52.A06;
                List A012 = CallsFragment.A01(r3, r10, r11, r52.A0B.A09, r52.A04);
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                while (true) {
                    AbstractList abstractList = (AbstractList) A012;
                    if (i6 >= abstractList.size()) {
                        break;
                    }
                    C007003k A09 = r10.A09((AnonymousClass02N) abstractList.get(i6));
                    if (A09 != null && i6 < 3) {
                        arrayList.add(A09);
                    }
                    i6++;
                }
                r52.A03.A00(arrayList, r52.A08, r52.A07);
                r52.A02.setText(CallsFragment.A00(A012, ((AnonymousClass0QM) r3.A03.get(0)).A05, r10, r11, r52.A0A, r52.A09));
                ImageView imageView = r52.A01;
                boolean A05 = r3.A05();
                int i7 = R.drawable.ic_voip_calls_tab_voice_indicator;
                if (A05) {
                    i7 = R.drawable.ic_voip_calls_tab_video_indicator;
                }
                imageView.setImageResource(i7);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                alphaAnimation.setInterpolator(AnonymousClass0N2.A0a(0.65f, 0.0f, 0.35f));
                alphaAnimation.setDuration(500);
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                r52.A01.startAnimation(alphaAnimation);
                r52.A00.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(r52, r3, 49));
                return view2;
            } else if (!(r5 instanceof C72533Tf)) {
                AnonymousClass3TO r53 = (AnonymousClass3TO) r5;
                C11260fz r112 = ((C72483Ta) ((AnonymousClass390) r53).A00).A00;
                C007003k A02 = r112.A02();
                if (A02 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(CallsFragment.class.getName());
                    sb.append(AnonymousClass1VY.A0D(A02.A09));
                    sb.append(" ");
                    sb.append(r112.A01());
                    String obj = sb.toString();
                    ImageView imageView2 = r53.A04;
                    AnonymousClass0Q7.A0g(imageView2, obj);
                    boolean A04 = r112.A04();
                    MultiContactThumbnail multiContactThumbnail = r53.A0K;
                    int i8 = 8;
                    int i9 = 8;
                    if (A04) {
                        i9 = 0;
                    }
                    multiContactThumbnail.setVisibility(i9);
                    int i10 = 0;
                    if (A04) {
                        i10 = 8;
                    }
                    imageView2.setVisibility(i10);
                    C11930hF r14 = r53.A0B;
                    TextEmojiLabel textEmojiLabel = r14.A00;
                    textEmojiLabel.setSingleLine(!A04);
                    if (A04) {
                        ArrayList arrayList2 = new ArrayList();
                        AnonymousClass01A r0 = r53.A0C;
                        C014308b r02 = r53.A0D;
                        callsFragment = r53.A0M;
                        List A013 = CallsFragment.A01(r112, r0, r02, callsFragment.A09, r53.A0A);
                        int i11 = 0;
                        while (true) {
                            AbstractList abstractList2 = (AbstractList) A013;
                            if (i11 >= abstractList2.size()) {
                                break;
                            }
                            C007003k A092 = r0.A09((AnonymousClass02N) abstractList2.get(i11));
                            if (A092 != null && i11 < 3) {
                                arrayList2.add(A092);
                            }
                            i11++;
                        }
                        textEmojiLabel.setMaxLines(2);
                        r14.A04(CallsFragment.A00(A013, ((AnonymousClass0QM) r112.A03.get(0)).A05, r0, r02, r53.A0J, r53.A0I), callsFragment.A09);
                        multiContactThumbnail.A00(arrayList2, r53.A0F, r53.A0E);
                    } else {
                        r53.A0G.A02(A02, imageView2);
                        callsFragment = r53.A0M;
                        r14.A03(A02, callsFragment.A09);
                    }
                    TextView textView = r53.A08;
                    AnonymousClass01X r13 = r53.A0I;
                    textView.setText(C002001d.A1F(r13, r112.A01()));
                    int size = r112.A03.size();
                    if (size > 1) {
                        TextView textView2 = r53.A07;
                        textView2.setText(String.format(r13.A0I(), "(%d)", Integer.valueOf(size)));
                        textView2.setVisibility(0);
                    } else {
                        r53.A07.setVisibility(8);
                    }
                    boolean contains = callsFragment.A0c.contains(r112.A03());
                    boolean remove = callsFragment.A0d.remove(r112.A03());
                    View view3 = r53.A01;
                    int i12 = 0;
                    if (contains) {
                        i12 = R.color.home_row_selection;
                    }
                    view3.setBackgroundResource(i12);
                    view3.setSelected(contains);
                    SelectionCheckView selectionCheckView = r53.A09;
                    selectionCheckView.A03(contains, remove);
                    int i13 = 8;
                    if (contains) {
                        i13 = 0;
                    }
                    selectionCheckView.setVisibility(i13);
                    AnonymousClass0Q7.A0g(imageView2, obj);
                    View$OnClickListenerC675338z r03 = new View$OnClickListenerC675338z(callsFragment, ((AnonymousClass390) r53).A00, r53);
                    View$OnLongClickListenerC670637b r142 = new View$OnLongClickListenerC670637b(r53, r112);
                    imageView2.setOnClickListener(r03);
                    imageView2.setOnLongClickListener(r142);
                    multiContactThumbnail.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r53, 22));
                    multiContactThumbnail.setOnLongClickListener(r142);
                    int A002 = r112.A00();
                    if (A002 == 0) {
                        i2 = R.drawable.ic_call_outgoing;
                    } else if (A002 != 1) {
                        i2 = R.drawable.ic_call_missed;
                        if (A002 != 2) {
                            i2 = 0;
                        }
                    } else {
                        i2 = R.drawable.ic_call_incoming;
                    }
                    ImageView imageView3 = r53.A03;
                    imageView3.setImageResource(i2);
                    int A014 = C28051Sr.A01(i2);
                    Context A003 = callsFragment.A00();
                    if (A003 != null) {
                        C002001d.A2m(imageView3, C004302a.A00(A003, A014));
                        int A004 = r112.A00();
                        if (A004 == 0) {
                            i3 = R.string.outgoing_call;
                        } else if (A004 != 1) {
                            i3 = R.string.missed_call;
                            if (A004 != 2) {
                                i3 = 0;
                            }
                        } else {
                            i3 = R.string.incoming_call;
                        }
                        imageView3.setContentDescription(r13.A06(i3));
                        ImageView imageView4 = r53.A06;
                        imageView4.setTag(r53);
                        AbstractView$OnClickListenerC08330av r4 = r53.A0L;
                        imageView4.setOnClickListener(r4);
                        View.OnTouchListener onTouchListener = r53.A00;
                        imageView4.setOnTouchListener(onTouchListener);
                        ImageView imageView5 = r53.A05;
                        imageView5.setTag(r53);
                        imageView5.setOnClickListener(r4);
                        imageView5.setOnTouchListener(onTouchListener);
                        imageView4.setVisibility(8);
                        imageView5.setVisibility(8);
                        if (r112.A05()) {
                            imageView5.setVisibility(0);
                        } else {
                            imageView4.setVisibility(0);
                        }
                        View view4 = r53.A02;
                        if (i != callsFragment.A0A.size() - 1) {
                            i8 = 0;
                        }
                        view4.setVisibility(i8);
                        return view2;
                    }
                    throw null;
                }
                throw null;
            } else {
                C72533Tf r54 = (C72533Tf) r5;
                C007003k A0A = r54.A0A.A0A(((C72503Tc) ((AnonymousClass390) r54).A00).A00);
                AnonymousClass0YX r04 = r54.A0B;
                ImageView imageView6 = r54.A03;
                r04.A02(A0A, imageView6);
                CallsFragment callsFragment3 = r54.A0D;
                imageView6.setOnClickListener(new View$OnClickListenerC675338z(callsFragment3, ((AnonymousClass390) r54).A00, r54));
                imageView6.setOnLongClickListener(null);
                C11930hF r1 = r54.A09;
                r1.A03(A0A, callsFragment3.A09);
                r1.A00.setSingleLine(true);
                r54.A05.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(r54, A0A, 47));
                r54.A04.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1_1(r54, A0A, 48));
                View view5 = r54.A01;
                int i14 = 0;
                if (i == callsFragment3.A0A.size() - 1) {
                    i14 = 8;
                }
                view5.setVisibility(i14);
                return view2;
            }
        } else {
            if (view == null) {
                view2 = callsFragment2.A0A().getLayoutInflater().inflate(R.layout.calls_tab_list_section, viewGroup, false);
                view2.setEnabled(false);
            }
            AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view2.getLayoutParams();
            layoutParams.height = -1;
            view2.setLayoutParams(layoutParams);
            TextView textView3 = (TextView) view2.findViewById(R.id.title);
            C002301g.A03(textView3);
            textView3.setText(((C72523Te) r7).A01);
            View findViewById = view2.findViewById(R.id.list_section_divider);
            if (i == 0) {
                i4 = 8;
            }
            findViewById.setVisibility(i4);
            return view2;
        }
    }
}

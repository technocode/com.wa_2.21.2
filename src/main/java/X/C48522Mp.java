package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.ClearableEditText;
import com.whatsapp.doodle.shapepicker.ShapePickerRecyclerView;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Mp  reason: invalid class name and case insensitive filesystem */
public class C48522Mp {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public ValueAnimator A04;
    public HandlerThread A05;
    public HandlerC48502Mn A06;
    public HandlerC48512Mo A07;
    public C53302cr A08;
    public AnonymousClass2ND A09;
    public C53342cv A0A;
    public String A0B;
    public Set A0C;
    public boolean A0D;
    public boolean A0E;
    public final Activity A0F;
    public final View.OnClickListener A0G = new ViewOnClickEBaseShape5S0100000_I1_3(this, 41);
    public final View.OnClickListener A0H = new ViewOnClickEBaseShape5S0100000_I1_3(this, 40);
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final ViewGroup A0N;
    public final ImageView A0O;
    public final TextView A0P;
    public final TextView A0Q;
    public final ClearableEditText A0R;
    public final C000300f A0S;
    public final AnonymousClass01X A0T;
    public final C52982cD A0U;
    public final C53022cH A0V;
    public final AbstractC48492Mm A0W;
    public final AnonymousClass2cQ A0X;
    public final C53102cR A0Y;
    public final ShapePickerRecyclerView A0Z;
    public final AnonymousClass2cW A0a;
    public final C02590Cr A0b;
    public final AnonymousClass0D1 A0c;
    public final AnonymousClass33L A0d = new C53032cI(this);
    public final C03620Gz A0e;
    public final AnonymousClass00T A0f;
    public final Map A0g = new HashMap();
    public final Map A0h = new HashMap();
    public final ConcurrentHashMap A0i = new ConcurrentHashMap();
    public final ConcurrentHashMap A0j = new ConcurrentHashMap();
    public final ConcurrentHashMap A0k;
    public final boolean A0l;
    public final boolean A0m;

    public C48522Mp(Activity activity, C06170Sb r16, AnonymousClass00T r17, C02590Cr r18, C000300f r19, C52982cD r20, AnonymousClass01X r21, C03620Gz r22, C03570Gt r23, AnonymousClass2cW r24, C53022cH r25, AnonymousClass0D1 r26, View view, AbstractC48492Mm r28, boolean z, boolean z2) {
        this.A0F = activity;
        this.A0f = r17;
        this.A0b = r18;
        this.A0S = r19;
        this.A0U = r20;
        this.A0T = r21;
        this.A0e = r22;
        this.A0a = r24;
        this.A0V = r25;
        this.A0c = r26;
        this.A0W = r28;
        this.A0m = z;
        this.A0l = z2;
        this.A01 = 2;
        this.A0X = new AnonymousClass2cQ(this);
        this.A0N = (ViewGroup) view;
        this.A0K = AnonymousClass0Q7.A0D(view, R.id.search_container);
        this.A0R = (ClearableEditText) AnonymousClass0Q7.A0D(view, R.id.search_entry);
        this.A0O = (ImageView) AnonymousClass0Q7.A0D(view, R.id.search_icon);
        this.A0J = AnonymousClass0Q7.A0D(view, R.id.search_button);
        this.A0Q = (TextView) AnonymousClass0Q7.A0D(view, R.id.sticker_tab_button);
        this.A0P = (TextView) AnonymousClass0Q7.A0D(view, R.id.emoji_tab_button);
        this.A0L = AnonymousClass0Q7.A0D(view, R.id.tab_buttons_container);
        this.A0M = AnonymousClass0Q7.A0D(view, R.id.shape_picker_gradient);
        this.A0I = AnonymousClass0Q7.A0D(view, R.id.shape_picker_header);
        this.A0R.setHint(r21.A06(R.string.search));
        this.A0R.getBackground().setAlpha(this.A0R.hasFocus() ? 230 : 204);
        this.A0R.setOnFocusChangeListener(new View$OnFocusChangeListenerC48412Mc(this, r16, activity));
        this.A0R.addTextChangedListener(new C53042cJ(this));
        ClearableEditText clearableEditText = this.A0R;
        View.OnClickListener onClickListener = this.A0G;
        clearableEditText.A01 = onClickListener;
        this.A0J.setOnClickListener(onClickListener);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) AnonymousClass0Q7.A0D(view, R.id.shapes);
        this.A0Z = shapePickerRecyclerView;
        shapePickerRecyclerView.setAdapter(this.A0X);
        List A012 = C48542Mr.A01(z2);
        this.A0k = new ConcurrentHashMap();
        AbstractList abstractList = (AbstractList) A012;
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            AbstractC48432Mf r5 = (AbstractC48432Mf) it.next();
            this.A0k.put(r5.A9J(), r5);
        }
        if (z) {
            this.A0Z.setItemAnimator(null);
            r17.ANC(new C10570eq(r20, this.A0X, this.A0k), new Void[0]);
            this.A08 = new C53302cr(r21, (RecyclerView) view.findViewById(R.id.emoji_shape_subcategories_recyclerview), this.A0Z);
            C53342cv r0 = new C53342cv(r21, r23, (RecyclerView) view.findViewById(R.id.sticker_shape_subcategories_recyclerview), this.A0Z);
            this.A0A = r0;
            ((AnonymousClass2ND) r0).A01 = true;
            r0.A00();
            this.A09 = this.A0A;
            AnonymousClass3R1 r13 = new AnonymousClass3R1(r23, new AnonymousClass2cS(r25, this));
            AnonymousClass2cQ r10 = this.A0X;
            AnonymousClass00E.A07(!r10.A06);
            r10.A06 = true;
            ((AbstractC16300pa) r10).A01.A02(r10.A05.size(), 1);
            r17.ANC(r13, new Void[0]);
            this.A0D = false;
            this.A0C = new LinkedHashSet();
            AnonymousClass2cB r1 = new AnonymousClass2cB(this);
            if (r23 != null) {
                Log.d("StickerRepository/getStarredStickersAsync/begin");
                r23.A0R.ANC(new C09780dW(r23, r1), new Void[0]);
                this.A0J.setVisibility(0);
                this.A0O.setVisibility(0);
                this.A0L.setVisibility(0);
                this.A0R.setVisibility(4);
                this.A0R.setAlwaysShowClearIcon(true);
                view.findViewById(R.id.shape_picker_header_background).setVisibility(0);
                this.A0Q.setOnClickListener(this.A0H);
                this.A0P.setOnClickListener(this.A0H);
                if (r21.A02().A06) {
                    this.A0Q.setBackgroundResource(R.drawable.shape_picker_right_tab_background);
                    this.A0P.setBackgroundResource(R.drawable.shape_picker_left_tab_background);
                }
                int dimensionPixelSize = this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_recycler_view_horizontal_padding);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Z.getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(2, R.id.shape_picker_subcategories_container);
                layoutParams.addRule(3, R.id.shape_picker_header);
                this.A0Z.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.A0Z.setLayoutParams(layoutParams);
                int dimensionPixelSize2 = this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_entry_extra_left_padding);
                ClearableEditText clearableEditText2 = this.A0R;
                clearableEditText2.setPadding(dimensionPixelSize2, clearableEditText2.getPaddingTop(), this.A0R.getPaddingRight(), this.A0R.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams2 = this.A0R.getLayoutParams();
                layoutParams2.height = this.A0F.getResources().getDimensionPixelOffset(R.dimen.shape_picker_expanded_search_height);
                this.A0R.setLayoutParams(layoutParams2);
                this.A0M.setVisibility(8);
                this.A0Z.A0j(new C53052cK(this, r21.A02().A06, this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_shape_top_margin), this.A0F.getResources().getDimensionPixelSize(R.dimen.shape_picker_section_top_margin)));
                r22.A01(this.A0d);
            } else {
                throw null;
            }
        }
        this.A0E = false;
        C53102cR r12 = new C53102cR(this, this.A0F);
        this.A0Y = r12;
        this.A0Z.A0l(r12);
        HandlerThread handlerThread = new HandlerThread("Shapes Thread", 10);
        this.A05 = handlerThread;
        handlerThread.start();
        this.A07 = new HandlerC48512Mo(this, this.A0F, this.A05.getLooper());
        this.A06 = new HandlerC48502Mn(this, this.A0F.getMainLooper());
        int dimensionPixelSize3 = this.A0F.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_size);
        for (int min = Math.min(((this.A0F.getResources().getDisplayMetrics().widthPixels * this.A0F.getResources().getDisplayMetrics().heightPixels) / (dimensionPixelSize3 * dimensionPixelSize3)) + 1, abstractList.size() - 1); min >= 0; min--) {
            Message obtain = Message.obtain(this.A07, 0, 0, 0, null);
            String A9J = ((AbstractC48432Mf) abstractList.get(min)).A9J();
            Bundle bundle = new Bundle();
            bundle.putString("tag_bundle_key", A9J);
            obtain.setData(bundle);
            obtain.sendToTarget();
        }
        if (z) {
            r24.A00 = new AnonymousClass2cA(this);
            A09(r24.A02);
            r24.A01();
        }
        A0A(false, 0);
        A03(0);
        this.A0L.addOnLayoutChangeListener(new AnonymousClass2Md(this));
    }

    public static List A00(C48522Mp r6, AnonymousClass33N r7) {
        if (r6 != null) {
            ArrayList arrayList = new ArrayList();
            for (C29241Xq r3 : r7.A04) {
                arrayList.add(new AnonymousClass2cX(r3, r6.A0S, r6.A0c));
            }
            return arrayList;
        }
        throw null;
    }

    public static void A01(C48522Mp r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2cX r2 = (AnonymousClass2cX) it.next();
            r4.A0k.put(r2.A9J(), r2);
        }
    }

    public static final void A02(List list, Collection collection) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            list.add(new C48472Mj((AnonymousClass2cX) it.next(), 0, i));
            i++;
        }
    }

    public final void A03(int i) {
        TextView textView;
        TextView textView2;
        AnonymousClass2ND r1;
        if (this.A01 != i && i != 2) {
            if (i == 0) {
                textView = this.A0Q;
                textView2 = this.A0P;
            } else {
                textView = this.A0P;
                textView2 = this.A0Q;
            }
            Activity activity = this.A0F;
            textView.setTextColor(C004302a.A00(activity, R.color.shape_picker_tab_selected_text_color));
            textView.getBackground().setAlpha(230);
            textView2.setTextColor(C004302a.A00(activity, R.color.shape_picker_tab_deselected_text_color));
            textView2.getBackground().setAlpha(51);
            this.A01 = i;
            AnonymousClass2cQ r12 = this.A0X;
            r12.A03 = null;
            r12.A02 = null;
            r12.A0A();
            ((AbstractC16300pa) r12).A01.A00();
            this.A0Z.A0X(0);
            AnonymousClass2ND r0 = this.A09;
            if (r0 != null) {
                r0.A01 = false;
                r0.A00();
            }
            if (this.A01 == 0) {
                r1 = this.A0A;
            } else {
                r1 = this.A08;
            }
            this.A09 = r1;
            if (r1 != null) {
                r1.A01 = true;
                r1.A00();
            }
        }
    }

    public final void A04(int i, int i2, long j, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A03 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A03.removeAllListeners();
        }
        this.A03.setDuration(j);
        this.A03.addUpdateListener(new C48422Me(i2, i, (ViewGroup.MarginLayoutParams) this.A0K.getLayoutParams()));
        this.A03.addListener(animatorListenerAdapter);
        this.A03.start();
    }

    public final void A05(int i, int i2, long j, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator = this.A04;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.A04 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A04.removeAllListeners();
        }
        this.A04.setDuration(j);
        View view = this.A0J;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(0);
        this.A04.addUpdateListener(new C48402Mb(this, layoutParams, i, view.getWidth(), i2, view.getHeight()));
        this.A04.addListener(animatorListenerAdapter);
        this.A04.start();
    }

    public final void A06(String str) {
        this.A0B = str;
        AnonymousClass2cW r5 = this.A0a;
        if (!r5.A02) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AnonymousClass2cQ r0 = this.A0X;
            r0.A03 = null;
            r0.A02 = null;
            r0.A0A();
            ((AbstractC16300pa) r0).A01.A00();
            return;
        }
        AnonymousClass2cQ r3 = this.A0X;
        boolean z = true;
        if (this.A01 != 1) {
            z = false;
        }
        AnonymousClass2Q9 A002 = r5.A00(str, z, false);
        AnonymousClass2Q9 r02 = r3.A02;
        if (r02 != null) {
            r02.A00(null);
        }
        r3.A02 = A002;
        r3.A03 = str;
        A002.A00(r3);
    }

    public final void A07(Collection collection, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass2cX r2 = new AnonymousClass2cX((C29241Xq) it.next(), this.A0S, this.A0c);
            this.A0k.put(r2.A9J(), r2);
            linkedHashSet.add(r2);
        }
        Set set = this.A0C;
        if (z) {
            linkedHashSet.addAll(set);
            this.A0C = linkedHashSet;
        } else {
            set.addAll(linkedHashSet);
        }
        C53022cH r3 = this.A0V;
        Set<AbstractC48432Mf> set2 = this.A0C;
        synchronized (r3) {
            Map map = r3.A04;
            map.clear();
            for (AbstractC48432Mf r0 : set2) {
                C53022cH.A01(r0, map);
            }
        }
    }

    public final void A08(List list, EnumC48532Mq[] r14) {
        for (EnumC48532Mq r2 : r14) {
            boolean z = this.A0m;
            if (z) {
                list.add(new C48472Mj(this.A0T.A06(r2.sectionResId), 1));
            }
            AbstractC48432Mf[] r7 = r2.shapeData;
            int i = 0;
            for (AbstractC48432Mf r3 : r7) {
                int A8W = r3.A8W(z);
                int i2 = -1;
                if (z) {
                    i2 = i;
                }
                list.add(new C48472Mj(r3, A8W, i2));
                i++;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A09(boolean z) {
        if (z) {
            this.A0K.setVisibility(0);
            if (!this.A0m) {
                Activity activity = this.A0F;
                int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_padding_top);
                ShapePickerRecyclerView shapePickerRecyclerView = this.A0Z;
                shapePickerRecyclerView.setPadding(shapePickerRecyclerView.getPaddingLeft(), dimensionPixelSize, shapePickerRecyclerView.getPaddingRight(), shapePickerRecyclerView.getPaddingBottom());
                View view = this.A0M;
                view.getLayoutParams().height = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_header_size);
                view.requestLayout();
            }
            if (this.A0N.getVisibility() != 0) {
                this.A0Z.A0X(0);
                this.A0Y.A01 = 0;
                return;
            }
            return;
        }
        this.A0K.setVisibility(4);
        if (!this.A0m) {
            TypedArray obtainStyledAttributes = this.A0F.getTheme().obtainStyledAttributes(new int[]{16843499});
            try {
                int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
                obtainStyledAttributes.recycle();
                ShapePickerRecyclerView shapePickerRecyclerView2 = this.A0Z;
                shapePickerRecyclerView2.setPadding(shapePickerRecyclerView2.getPaddingLeft(), dimension, shapePickerRecyclerView2.getPaddingRight(), shapePickerRecyclerView2.getPaddingBottom());
                View view2 = this.A0M;
                view2.getLayoutParams().height = dimension;
                view2.requestLayout();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.A0Z.A0X(0);
        this.A0Y.A01 = 0;
    }

    public final void A0A(boolean z, long j) {
        if (!this.A0m) {
            return;
        }
        if (z) {
            int width = this.A0R.getWidth();
            Activity activity = this.A0F;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_expanded_search_height);
            C48442Mg r8 = new C48442Mg(this);
            A05(width, dimensionPixelSize, j, r8);
            if (!this.A0E) {
                A04(activity.getResources().getDimensionPixelSize(R.dimen.search_container_top_margin), activity.getResources().getDimensionPixelSize(R.dimen.search_container_expanded_top_margin), j, r8);
                return;
            }
            return;
        }
        Activity activity2 = this.A0F;
        int dimensionPixelSize2 = activity2.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_collapsed_width);
        int dimensionPixelSize3 = activity2.getResources().getDimensionPixelSize(R.dimen.shape_picker_collapsed_search_height);
        C48452Mh r82 = new C48452Mh(this);
        A05(dimensionPixelSize2, dimensionPixelSize3, j, r82);
        if (!this.A0E) {
            A04(activity2.getResources().getDimensionPixelSize(R.dimen.search_container_expanded_top_margin), activity2.getResources().getDimensionPixelSize(R.dimen.search_container_top_margin), j, r82);
        }
    }
}

package com.whatsapp.voipcalling;

import X.AnonymousClass01X;
import X.AnonymousClass03P;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YP;
import X.AnonymousClass1VY;
import X.AnonymousClass394;
import X.AnonymousClass395;
import X.C002001d;
import X.C004302a;
import X.C06470Tj;
import X.C14270lr;
import X.C72613To;
import X.C72623Tp;
import X.View$OnTouchListenerC671937o;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;
import java.util.AbstractCollection;
import java.util.ArrayList;

public class GroupCallParticipantPickerSheet extends GroupCallParticipantPicker {
    public float A00;
    public float A01;
    public ColorDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewTreeObserver.OnGlobalLayoutListener A06 = new AnonymousClass395(this);
    public SearchView A07;
    public BottomSheetBehavior A08;
    public boolean A09;
    public final AnonymousClass03P A0A = AnonymousClass03P.A00();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();

    public void A0l() {
        if (((GroupCallParticipantPicker) this).A00 != null) {
            A0T().addHeaderView(((GroupCallParticipantPicker) this).A00, null, false);
        }
        this.A07.A0E("");
        C14270lr r1 = (C14270lr) this.A03.getLayoutParams();
        r1.A00(this.A08);
        ((ViewGroup.MarginLayoutParams) r1).height = (int) this.A00;
        this.A03.setLayoutParams(r1);
        this.A05.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public void A0m() {
        if (((GroupCallParticipantPicker) this).A00 != null) {
            A0T().removeHeaderView(((GroupCallParticipantPicker) this).A00);
        }
        C14270lr r1 = (C14270lr) this.A03.getLayoutParams();
        r1.A00(null);
        ((ViewGroup.MarginLayoutParams) r1).height = -1;
        this.A03.setLayoutParams(r1);
        this.A07.setIconified(false);
        this.A05.setVisibility(8);
        this.A04.setVisibility(0);
    }

    public final void A0n() {
        int size;
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        float f = (float) (point.y - rect.top);
        this.A01 = f;
        this.A00 = (float) ((int) (f * 0.75f));
        if (!C002001d.A3H(this.A0A.A0G())) {
            int i = (int) (this.A01 * 0.55f);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.info_screen_card_spacing) + getResources().getDimensionPixelSize(R.dimen.group_call_participant_picker_sheet_search_holder_height);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.contact_picker_row_height);
            int i2 = ((dimensionPixelSize2 >> 1) - ((i - dimensionPixelSize) % dimensionPixelSize2)) + i;
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
            if (stringArrayListExtra != null && (size = stringArrayListExtra.size()) > 0) {
                i2 = Math.min(i2, (dimensionPixelSize2 * size) + dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height_big));
            }
            this.A08.A0C(i2);
        }
    }

    public /* synthetic */ void lambda$onCreate$2714$GroupCallParticipantPickerSheet(View view) {
        A0m();
    }

    @Override // com.whatsapp.voipcalling.GroupCallParticipantPicker, X.AnonymousClass0QH, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A04.getVisibility() == 0) {
            A0l();
        } else {
            this.A08.A0D(5);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0n();
        if (this.A04.getVisibility() != 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
            marginLayoutParams.height = (int) this.A00;
            this.A03.setLayoutParams(marginLayoutParams);
        }
        this.A09 = true;
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
        this.A03.requestLayout();
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0QH, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.action_bar).setVisibility(8);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        int A002 = C004302a.A00(this, R.color.primary_dark_dimmed);
        int A003 = C004302a.A00(this, R.color.primary_dark);
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A03 = findViewById;
        this.A08 = BottomSheetBehavior.A00(findViewById);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
        BottomSheetBehavior bottomSheetBehavior = this.A08;
        bottomSheetBehavior.A0J = true;
        bottomSheetBehavior.A0D(5);
        A0n();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A03.getLayoutParams();
        marginLayoutParams.height = (int) this.A00;
        this.A03.setLayoutParams(marginLayoutParams);
        ListView A0T = A0T();
        if (Build.VERSION.SDK_INT >= 21) {
            A0T.setNestedScrollingEnabled(true);
        }
        View findViewById2 = findViewById(R.id.background);
        AnonymousClass0Q7.A0W(findViewById2, 2);
        PointF pointF = new PointF();
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, pointF, 8));
        findViewById2.setOnTouchListener(new View$OnTouchListenerC671937o(pointF));
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A02 = colorDrawable;
        findViewById2.setBackground(colorDrawable);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) getResources().getInteger(17694720));
        findViewById2.startAnimation(alphaAnimation);
        this.A08.A0E = new C72613To(this, A003, A002);
        this.A05 = findViewById(R.id.title_holder);
        View findViewById3 = findViewById(R.id.search_holder_sheet);
        this.A04 = findViewById3;
        AnonymousClass0YP.A00(findViewById3);
        this.A04.setVisibility(8);
        SearchView searchView = (SearchView) this.A04.findViewById(R.id.search_view);
        this.A07 = searchView;
        searchView.setIconifiedByDefault(false);
        SearchView searchView2 = this.A07;
        AnonymousClass01X r4 = this.A0B;
        searchView2.setQueryHint(r4.A06(R.string.group_call_participant_search_hint));
        ((ImageView) this.A07.findViewById(R.id.search_mag_icon)).setImageDrawable(new AnonymousClass394(C004302a.A03(this, R.drawable.ic_back_teal)));
        this.A07.A0B = new C72623Tp(this);
        ImageView imageView = (ImageView) this.A04.findViewById(R.id.search_back);
        imageView.setImageDrawable(new C06470Tj(r4, C004302a.A03(this, R.drawable.ic_back_teal)));
        imageView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 18));
        findViewById(R.id.search_btn).setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 24));
        ((TextView) findViewById(R.id.sheet_title)).setText(r4.A08(R.plurals.group_call_participant_picker_sheet_title, (long) ((AbstractCollection) AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("jids"))).size()));
    }

    @Override // X.AnonymousClass0QH, X.ActivityC03630Ha
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A0m();
        }
    }

    @Override // X.AnonymousClass0QH, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean z = false;
        if (this.A04.getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("search", z);
    }
}

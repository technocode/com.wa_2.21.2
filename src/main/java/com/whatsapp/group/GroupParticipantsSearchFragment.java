package com.whatsapp.group;

import X.ActivityC03630Ha;
import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0YP;
import X.AnonymousClass2QQ;
import X.AnonymousClass2QY;
import X.C004302a;
import X.C06170Sb;
import X.C06470Tj;
import X.C49362Qe;
import X.C49372Qf;
import X.C54972fn;
import X.C54982fo;
import X.C54992fp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.chatinfo.ChatInfoLayout;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;

public class GroupParticipantsSearchFragment extends WaFragment {
    public ChatInfoLayout A00;
    public AnonymousClass2QY A01;
    public boolean A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final C06170Sb A04 = C06170Sb.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.group_participants_search_fragment, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        this.A0U = true;
        GroupChatInfo groupChatInfo = (GroupChatInfo) A0A();
        View view = this.A0A;
        if (view != null) {
            AbsListView absListView = (AbsListView) view.findViewById(16908298);
            AnonymousClass2QY r0 = groupChatInfo.A0M;
            this.A01 = r0;
            absListView.setAdapter((ListAdapter) r0);
            AnonymousClass2QY r1 = this.A01;
            boolean z = r1.A03;
            this.A02 = z;
            if (!z) {
                r1.A03 = true;
                r1.notifyDataSetChanged();
            }
            groupChatInfo.registerForContextMenu(absListView);
            absListView.setOnItemClickListener(new AnonymousClass2QQ(groupChatInfo));
            absListView.setOnScrollListener(new C49362Qe(this));
            View findViewById = view.findViewById(R.id.search_holder);
            AnonymousClass0YP.A00(findViewById);
            SearchView searchView = (SearchView) findViewById.findViewById(R.id.search_view);
            ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(C004302a.A00(A00(), R.color.search_text_color));
            searchView.setIconifiedByDefault(false);
            View A0n = A0n();
            if (A0n == null) {
                searchView.setIconified(false);
            } else {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (A0n.getTop() - absListView.getPaddingTop()), 0.0f);
                translateAnimation.setDuration(240);
                translateAnimation.setAnimationListener(new C54972fn(searchView));
                absListView.startAnimation(translateAnimation);
            }
            AnonymousClass01X r4 = this.A03;
            searchView.setQueryHint(r4.A06(R.string.search_hint));
            searchView.A0B = new C54982fo(groupChatInfo);
            ((ImageView) searchView.findViewById(R.id.search_mag_icon)).setImageDrawable(new C49372Qf(C004302a.A03(A00(), R.drawable.ic_back_teal)));
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation2.setDuration(240);
            findViewById.startAnimation(translateAnimation2);
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.search_back);
            imageView.setImageDrawable(new C06470Tj(r4, C004302a.A03(A00(), R.drawable.ic_back_teal)));
            imageView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 24));
            return;
        }
        throw null;
    }

    public final View A0n() {
        ActivityC03630Ha r5 = (ActivityC03630Ha) A0A();
        View view = null;
        if (r5 != null) {
            int childCount = r5.A0T().getChildCount();
            for (int i = 0; i < childCount && view == null; i++) {
                View childAt = r5.A0T().getChildAt(i);
                if (childAt.getTag() != null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public void A0o() {
        View view = this.A0A;
        if (view != null) {
            View A0n = A0n();
            SearchView searchView = (SearchView) view.findViewById(R.id.search_view);
            searchView.A0E("");
            if (1 != 0) {
                searchView.A05();
            } else {
                searchView.A0G(false);
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.A07;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            }
            GroupChatInfo groupChatInfo = (GroupChatInfo) A0A();
            if (groupChatInfo != null) {
                groupChatInfo.A0M.A04.filter(null);
            }
            View findViewById = view.findViewById(R.id.search_holder);
            findViewById.setVisibility(8);
            AnonymousClass2QY r2 = this.A01;
            boolean z = this.A02;
            if (r2.A03 != z) {
                r2.A03 = z;
                r2.notifyDataSetChanged();
            }
            if (A0n != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(240);
                findViewById.startAnimation(alphaAnimation);
                View findViewById2 = view.findViewById(16908298);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (A0n.getTop() - findViewById2.getPaddingTop()));
                translateAnimation.setDuration(240);
                translateAnimation.setAnimationListener(new C54992fp(this));
                findViewById2.startAnimation(translateAnimation);
            } else {
                this.A0H.A0t();
            }
            AnonymousClass0Q7.A0W(this.A00, 1);
        }
    }
}

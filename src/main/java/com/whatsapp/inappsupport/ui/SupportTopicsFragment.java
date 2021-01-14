package com.whatsapp.inappsupport.ui;

import X.C49482Qq;
import X.C49552Qx;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import java.util.ArrayList;

public class SupportTopicsFragment extends WaFragment {
    public C49482Qq A00;
    public SupportTopicsActivity A01;
    public ArrayList A02;

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.support_topics_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.topic_list_header);
        if (this.A01.A01 != 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((AbsListView) inflate.findViewById(R.id.topic_list)).setAdapter((ListAdapter) new C49552Qx(this.A01, this.A02));
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        if (context instanceof SupportTopicsActivity) {
            this.A01 = (SupportTopicsActivity) context;
            super.A0a(context);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SupportTopicsFragment");
        sb.append(" can only be used with ");
        sb.append("SupportTopicsActivity");
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A00 = (C49482Qq) this.A06.getParcelable("parent_topic");
        this.A02 = this.A06.getParcelableArrayList("topics");
    }
}

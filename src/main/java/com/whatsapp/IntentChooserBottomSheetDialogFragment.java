package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.C40201sn;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

public class IntentChooserBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public Integer A02;
    public ArrayList A03;
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.intent_selector, viewGroup, false);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("request_code");
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("choosable_intents");
            if (parcelableArrayList != null) {
                this.A03 = parcelableArrayList;
                this.A01 = bundle2.getInt("title_resource");
                if (bundle2.containsKey("parent_fragment")) {
                    this.A02 = Integer.valueOf(bundle2.getInt("parent_fragment"));
                }
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.intent_recycler);
                A01();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                recyclerView.setAdapter(new C40201sn(this, this.A03));
                ((TextView) inflate.findViewById(R.id.title)).setText(this.A04.A06(this.A01));
                return inflate;
            }
            throw null;
        }
        throw null;
    }
}

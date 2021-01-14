package com.whatsapp.voipcalling;

import X.AbstractC07240Wo;
import X.AbstractC12270hp;
import X.AbstractC16300pa;
import X.AbstractC674838t;
import X.AnonymousClass0YX;
import X.AnonymousClass3TY;
import X.C000300f;
import X.C002001d;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.List;

public class CallPictureGrid extends RecyclerView {
    public AbstractC12270hp A00;
    public AnonymousClass3TY A01 = new AnonymousClass3TY(this, getHeight());
    public AbstractC674838t A02;
    public final C000300f A03 = C000300f.A00();

    public class NonScrollingGridLayoutManager extends StaggeredGridLayoutManager {
    }

    public CallPictureGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        NonScrollingGridLayoutManager nonScrollingGridLayoutManager = new NonScrollingGridLayoutManager();
        setBackgroundColor(getResources().getColor(C002001d.A3M(this.A03) ? R.color.primary_voip : R.color.primary));
        setLayoutManager(nonScrollingGridLayoutManager);
        setAdapter(this.A01);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 != i2) {
            AnonymousClass3TY r0 = this.A01;
            r0.A00 = i2;
            ((AbstractC16300pa) r0).A01.A00();
        }
    }

    public void setCallInfo(CallInfo callInfo) {
        this.A01.A02 = callInfo;
    }

    public void setCancelListener(AbstractC674838t r1) {
        this.A02 = r1;
    }

    public void setContacts(List list) {
        AnonymousClass3TY r3 = this.A01;
        if (r3 != null) {
            StringBuilder sb = new StringBuilder("voip/CallerPhotoGridAdapter/setContact ");
            sb.append(list);
            Log.d(sb.toString());
            List list2 = r3.A08;
            list2.clear();
            if (list.size() > 8) {
                list = list.subList(0, 8);
            }
            list2.addAll(list);
            ((AbstractC16300pa) r3).A01.A00();
            return;
        }
        throw null;
    }

    public void setParticipantStatusStringProvider(AbstractC07240Wo r2) {
        this.A01.A03 = r2;
    }

    public void setPhotoDisplayer(AbstractC12270hp r1) {
        this.A00 = r1;
    }

    public void setPhotoLoader(AnonymousClass0YX r2) {
        this.A01.A01 = r2;
    }
}

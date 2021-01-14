package com.whatsapp.voipcalling;

import X.AbstractC12270hp;
import X.AnonymousClass01X;
import X.AnonymousClass0L2;
import X.AnonymousClass0YX;
import X.C72683Tv;
import X.C72703Tx;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;

public class PeerAvatarLayout extends RecyclerView {
    public int A00;
    public int A01;
    public AnonymousClass0YX A02;
    public C72703Tx A03 = new C72703Tx(this);
    public final AbstractC12270hp A04 = new C72683Tv();
    public final AnonymousClass0L2 A05 = AnonymousClass0L2.A01();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public class NonScrollingLinearLayoutManager extends LinearLayoutManager {
        public NonScrollingLinearLayoutManager() {
            super(1);
        }
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        NonScrollingLinearLayoutManager nonScrollingLinearLayoutManager = new NonScrollingLinearLayoutManager();
        nonScrollingLinearLayoutManager.A1A(0);
        setLayoutManager(nonScrollingLinearLayoutManager);
        setAdapter(this.A03);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.call_avatar_view_elevation_difference);
        this.A02 = new AnonymousClass0YX(this.A05, getResources().getDimensionPixelSize(R.dimen.call_avatar_view_photo), 0.0f);
    }
}

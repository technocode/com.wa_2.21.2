package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0bo  reason: invalid class name and case insensitive filesystem */
public class C08840bo {
    public Context A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public RecyclerView A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public AnonymousClass0YX A0E;
    public C55442gY A0F;
    public boolean A0G;
    public final AnonymousClass01A A0H;
    public final C014308b A0I;
    public final AnonymousClass00S A0J;
    public final AnonymousClass01X A0K;
    public final C006903j A0L;

    public C08840bo(Context context, AnonymousClass00S r5, C006903j r6, AnonymousClass01A r7, C014308b r8, AnonymousClass01X r9, AnonymousClass0YX r10, ViewGroup viewGroup) {
        this.A00 = context;
        this.A0J = r5;
        this.A0L = r6;
        this.A01 = LayoutInflater.from(context);
        this.A0H = r7;
        this.A0I = r8;
        this.A0K = r9;
        this.A0E = r10;
        this.A07 = (TextView) viewGroup.findViewById(R.id.group_creator);
        this.A0D = (TextEmojiLabel) viewGroup.findViewById(R.id.group_name);
        this.A0C = (TextEmojiLabel) viewGroup.findViewById(R.id.group_description_preview);
        this.A05 = (ViewGroup) viewGroup.findViewById(R.id.participants_no_known_contacts);
        this.A0A = (TextView) viewGroup.findViewById(R.id.participants_header);
        this.A09 = (TextView) viewGroup.findViewById(R.id.participant_count);
        this.A06 = (ImageView) viewGroup.findViewById(R.id.group_photo);
        this.A08 = (TextView) viewGroup.findViewById(R.id.invite_expiration_time);
        this.A04 = viewGroup.findViewById(R.id.group_photo_container);
        this.A03 = viewGroup.findViewById(R.id.group_info);
        this.A02 = viewGroup.findViewById(R.id.background);
        this.A0B = (RecyclerView) viewGroup.findViewById(R.id.group_participants);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1A(0);
        this.A0B.setLayoutManager(linearLayoutManager);
        C55442gY r1 = new C55442gY(this);
        this.A0F = r1;
        this.A0B.setAdapter(r1);
    }

    public void A00(Bitmap bitmap) {
        if (bitmap == null) {
            Log.e("GroupInviteInfoViewController/decode-photo-bytes-returns-null");
            return;
        }
        AlphaAnimation A022 = AnonymousClass008.A02(1.0f, 0.0f, 100);
        A022.setAnimationListener(new C55422gW(this, bitmap));
        this.A06.startAnimation(A022);
    }

    public void A01(AnonymousClass2RU r13, long j) {
        C007003k r9;
        UserJid userJid = r13.A02;
        String str = null;
        if (userJid != null) {
            r9 = this.A0H.A0A(userJid);
        } else {
            r9 = null;
        }
        this.A0D.A02(r13.A04);
        if (r9 == null || !this.A0G) {
            this.A07.setVisibility(8);
        } else {
            this.A07.setVisibility(0);
            this.A07.setText(this.A0K.A0D(R.string.join_group_creator_message, this.A0I.A06(r9)));
        }
        C11220fu r0 = r13.A03;
        if (r0 != null) {
            str = r0.A02;
        }
        if (!TextUtils.isEmpty(str)) {
            this.A0C.A02(str);
            this.A0C.setVisibility(0);
        } else {
            this.A0C.setVisibility(8);
        }
        ArrayList arrayList = r13.A05;
        boolean z = !arrayList.isEmpty();
        TextView textView = this.A0A;
        int i = 8;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        ViewGroup viewGroup = this.A05;
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        RecyclerView recyclerView = this.A0B;
        int i3 = 8;
        if (z) {
            i3 = 0;
        }
        recyclerView.setVisibility(i3);
        TextView textView2 = this.A0A;
        AnonymousClass01X r6 = this.A0K;
        int i4 = r13.A00;
        long j2 = (long) i4;
        Integer valueOf = Integer.valueOf(i4);
        textView2.setText(r6.A0A(R.plurals.participants_title, j2, valueOf));
        this.A09.setText(r6.A0A(R.plurals.participants_title, j2, valueOf));
        C55442gY r02 = this.A0F;
        r02.A01 = arrayList;
        ((AbstractC16300pa) r02).A01.A00();
        C55442gY r03 = this.A0F;
        r03.A00 = i4;
        ((AbstractC16300pa) r03).A01.A00();
        long A052 = j - this.A0J.A05();
        if (A052 > 0) {
            double d = (double) A052;
            int ceil = (int) Math.ceil(d / 8.64E7d);
            if (((int) Math.floor(d / 3600000.0d)) < 12) {
                this.A08.setText(r6.A0D(R.string.invite_expiration_at_time, AnonymousClass0OZ.A00(r6, j)));
            } else {
                this.A08.setText(r6.A0A(R.plurals.invite_expires_days, (long) ceil, Integer.valueOf(ceil)));
            }
            this.A08.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2RX(this, (float) this.A02.getHeight()));
        this.A04.setVisibility(0);
    }
}

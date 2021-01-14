package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.MessageDetailsActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Mj  reason: invalid class name and case insensitive filesystem */
public class C26771Mj extends BaseAdapter {
    public UserJid A00;
    public final int A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C26771Mj(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = messageDetailsActivity.getResources().getInteger(17694721);
    }

    public final void A00(int i, View view) {
        int i2;
        MessageDetailsActivity messageDetailsActivity = this.A02;
        ArrayList arrayList = messageDetailsActivity.A0U;
        C26781Mk r0 = (C26781Mk) arrayList.get(i);
        View findViewById = view.findViewById(R.id.section_header);
        if (i == 0 || r0.A00() != ((C26781Mk) arrayList.get(i - 1)).A00()) {
            findViewById.setVisibility(0);
            TextView textView = (TextView) view.findViewById(R.id.section_title);
            TextView textView2 = (TextView) view.findViewById(R.id.section_icon);
            int A002 = r0.A00();
            if (A002 == 5) {
                textView.setText(R.string.message_delivered_to);
                textView2.setCompoundDrawablesWithIntrinsicBounds(C002001d.A0b(view.getContext(), R.drawable.msg_status_client, R.color.msgStatusTint), (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (A002 == 8) {
                textView.setText(R.string.message_played_by);
                textView2.setCompoundDrawablesWithIntrinsicBounds(C002001d.A0b(view.getContext(), R.drawable.msg_status_mic, R.color.msgStatusReadTint), (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (A002 == 13) {
                byte b = messageDetailsActivity.A06.A0m;
                int i3 = R.string.message_seen_by;
                if (b == 0) {
                    i3 = R.string.message_read_by;
                }
                textView.setText(i3);
                textView2.setCompoundDrawablesWithIntrinsicBounds(C002001d.A0b(view.getContext(), R.drawable.msg_status_client, R.color.msgStatusReadTint), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.divider);
        View findViewById3 = view.findViewById(R.id.content);
        if (i == arrayList.size() - 1 || r0.A00() != ((C26781Mk) arrayList.get(i + 1)).A00()) {
            findViewById3.setBackgroundResource(R.drawable.panel_bot);
            findViewById2.setVisibility(8);
        } else {
            findViewById3.setBackgroundResource(R.drawable.panel_mid);
            findViewById2.setVisibility(0);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.contact_photo);
        C014308b r02 = messageDetailsActivity.A0F;
        AnonymousClass01X r03 = ((AnonymousClass2C0) messageDetailsActivity).A01;
        C11930hF r1 = new C11930hF(view, R.id.contact_name, r02, r03, messageDetailsActivity.A0P);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view.findViewById(R.id.push_name);
        TextView textView3 = (TextView) view.findViewById(R.id.remaining);
        View findViewById4 = view.findViewById(R.id.date_time_delivered_group);
        View findViewById5 = view.findViewById(R.id.date_time_read_group);
        View findViewById6 = view.findViewById(R.id.date_time_played_group);
        TextView textView4 = (TextView) view.findViewById(R.id.date_time_delivered);
        TextView textView5 = (TextView) view.findViewById(R.id.date_time_read);
        TextView textView6 = (TextView) view.findViewById(R.id.date_time_played);
        View findViewById7 = view.findViewById(R.id.date_time_delivered_label);
        View findViewById8 = view.findViewById(R.id.date_time_read_label);
        View findViewById9 = view.findViewById(R.id.date_time_played_label);
        findViewById4.setVisibility(8);
        findViewById5.setVisibility(8);
        findViewById6.setVisibility(8);
        findViewById7.setVisibility(8);
        findViewById8.setVisibility(8);
        findViewById9.setVisibility(8);
        if (r0 instanceof AnonymousClass1t5) {
            textView3.setVisibility(0);
            imageView.setVisibility(8);
            r1.A00.setVisibility(8);
            textEmojiLabel.setVisibility(8);
            int i4 = ((AnonymousClass1t5) r0).A00;
            textView3.setText(r03.A0A(R.plurals.participants_remaining, (long) i4, Integer.valueOf(i4)));
            view.setTag(null);
            findViewById3.setOnClickListener(null);
            return;
        }
        C007003k A0A = messageDetailsActivity.A0C.A0A(r0.A01);
        textView3.setVisibility(8);
        imageView.setVisibility(0);
        AnonymousClass0YX r04 = messageDetailsActivity.A03;
        r04.A04(A0A, imageView, false, new C12260ho(r04.A04.A01, A0A));
        r1.A00.setVisibility(0);
        r1.A03(A0A, null);
        if (!A0A.A07()) {
            textEmojiLabel.setVisibility(8);
        } else if (A0A.A08() || TextUtils.isEmpty(A0A.A0O)) {
            if (A0A.A08()) {
                if (r02 == null) {
                    throw null;
                } else if (!TextUtils.isEmpty(A0A.A04())) {
                    textEmojiLabel.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append("~");
                    sb.append(A0A.A04());
                    textEmojiLabel.A02(sb.toString());
                }
            }
            textEmojiLabel.setVisibility(8);
        } else {
            textEmojiLabel.setVisibility(0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("~");
            sb2.append(A0A.A0O);
            textEmojiLabel.A02(sb2.toString());
        }
        if (A0A.A09.equals(this.A00)) {
            long A012 = r0.A01(5);
            if (A012 > 0) {
                textView4.setText(MessageDetailsActivity.A04(messageDetailsActivity, A012));
                i2 = 0;
                findViewById4.setVisibility(0);
                findViewById7.setVisibility(0);
            } else {
                i2 = 0;
            }
            long A013 = r0.A01(13);
            if (A013 > 0) {
                textView5.setText(MessageDetailsActivity.A04(messageDetailsActivity, A013));
                findViewById5.setVisibility(i2);
                findViewById8.setVisibility(i2);
            }
            long A014 = r0.A01(8);
            if (A014 > 0) {
                textView6.setText(MessageDetailsActivity.A04(messageDetailsActivity, A014));
                findViewById6.setVisibility(i2);
                findViewById9.setVisibility(i2);
            }
        } else {
            int A003 = r0.A00();
            if (A003 == 5) {
                textView4.setText(MessageDetailsActivity.A04(messageDetailsActivity, r0.A01(5)));
                findViewById4.setVisibility(0);
            } else if (A003 == 8) {
                textView6.setText(MessageDetailsActivity.A04(messageDetailsActivity, r0.A01(8)));
                findViewById6.setVisibility(0);
            } else if (A003 == 13) {
                textView5.setText(MessageDetailsActivity.A04(messageDetailsActivity, r0.A01(13)));
                findViewById5.setVisibility(0);
            }
        }
        view.setTag(A0A.A09);
        findViewById3.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I1(this, view, i, 0));
    }

    public final void A01(int i, View view, boolean z) {
        TranslateAnimation translateAnimation;
        AlphaAnimation alphaAnimation;
        TranslateAnimation translateAnimation2;
        TranslateAnimation translateAnimation3;
        MessageDetailsActivity messageDetailsActivity = this.A02;
        View findViewById = view.findViewById(R.id.date_time_delivered);
        View findViewById2 = view.findViewById(R.id.date_time_read);
        View findViewById3 = view.findViewById(R.id.date_time_played);
        View findViewById4 = view.findViewById(R.id.date_time_delivered_label);
        View findViewById5 = view.findViewById(R.id.date_time_read_label);
        View findViewById6 = view.findViewById(R.id.date_time_played_label);
        View findViewById7 = view.findViewById(R.id.date_time_delivered_group);
        View findViewById8 = view.findViewById(R.id.date_time_read_group);
        View findViewById9 = view.findViewById(R.id.date_time_played_group);
        ArrayList arrayList = new ArrayList(6);
        int A002 = ((C26781Mk) messageDetailsActivity.A0U.get(i)).A00();
        if (A002 == 5) {
            arrayList.add(findViewById4);
            if (((AnonymousClass2C0) messageDetailsActivity).A01.A0M()) {
                if (z) {
                    translateAnimation = new TranslateAnimation((float) (findViewById.getWidth() - findViewById7.getWidth()), 0.0f, 0.0f, 0.0f);
                } else {
                    translateAnimation = new TranslateAnimation((float) findViewById4.getWidth(), 0.0f, 0.0f, 0.0f);
                }
                translateAnimation.setDuration((long) this.A01);
                translateAnimation.setInterpolator(new DecelerateInterpolator());
                findViewById.startAnimation(translateAnimation);
            }
        } else if (A002 == 8) {
            arrayList.add(findViewById6);
            arrayList.add(findViewById8);
            arrayList.add(findViewById5);
            arrayList.add(findViewById7);
            arrayList.add(findViewById4);
            if (((AnonymousClass2C0) messageDetailsActivity).A01.A0M()) {
                if (z) {
                    translateAnimation2 = new TranslateAnimation((float) (findViewById3.getWidth() - findViewById9.getWidth()), 0.0f, 0.0f, 0.0f);
                } else {
                    translateAnimation2 = new TranslateAnimation((float) findViewById6.getWidth(), 0.0f, 0.0f, 0.0f);
                }
                translateAnimation2.setDuration((long) this.A01);
                translateAnimation2.setInterpolator(new DecelerateInterpolator());
                findViewById3.startAnimation(translateAnimation2);
            }
        } else if (A002 == 13) {
            arrayList.add(findViewById5);
            arrayList.add(findViewById7);
            arrayList.add(findViewById4);
            if (((AnonymousClass2C0) messageDetailsActivity).A01.A0M()) {
                if (z) {
                    translateAnimation3 = new TranslateAnimation((float) (findViewById2.getWidth() - findViewById8.getWidth()), 0.0f, 0.0f, 0.0f);
                } else {
                    translateAnimation3 = new TranslateAnimation((float) findViewById5.getWidth(), 0.0f, 0.0f, 0.0f);
                }
                translateAnimation3.setDuration((long) this.A01);
                translateAnimation3.setInterpolator(new DecelerateInterpolator());
                findViewById2.startAnimation(translateAnimation3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            if (z) {
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                int i2 = this.A01;
                alphaAnimation.setDuration((long) i2);
                alphaAnimation.setStartOffset((long) (((float) i2) * 0.0f));
            } else {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                int i3 = this.A01;
                alphaAnimation.setDuration((long) i3);
                alphaAnimation.setStartOffset((long) (((float) i3) * 0.0f));
            }
            view2.startAnimation(alphaAnimation);
        }
        View findViewById10 = view.findViewById(R.id.timestamps);
        int height = findViewById10.getHeight();
        A00(i, view);
        findViewById10.measure(View.MeasureSpec.makeMeasureSpec(findViewById10.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = findViewById10.getMeasuredHeight();
        findViewById10.getLayoutParams().height = height;
        C26761Mi r2 = new C26761Mi(findViewById10, height, measuredHeight);
        r2.setDuration((long) this.A01);
        findViewById10.startAnimation(r2);
    }

    public int getCount() {
        return this.A02.A0U.size();
    }

    public Object getItem(int i) {
        return this.A02.A0U.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.A02.getLayoutInflater().inflate(R.layout.message_details_row, viewGroup, false);
        }
        A00(i, view);
        return view;
    }
}

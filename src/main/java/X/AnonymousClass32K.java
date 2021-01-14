package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactStatusThumbnail;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.status.playback.MyStatusesActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.32K  reason: invalid class name */
public class AnonymousClass32K extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ MyStatusesActivity A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public AnonymousClass32K(MyStatusesActivity myStatusesActivity) {
        this.A01 = myStatusesActivity;
    }

    public int getCount() {
        return this.A00.size();
    }

    public Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass32M r0;
        TextView textView;
        MyStatusesActivity myStatusesActivity;
        AnonymousClass01X r8;
        AnonymousClass0M4 r2;
        ImageView imageView;
        TextView textView2;
        View view2;
        View view3 = view;
        if (view == null) {
            MyStatusesActivity myStatusesActivity2 = this.A01;
            view3 = myStatusesActivity2.getLayoutInflater().inflate(R.layout.my_statuses_row, viewGroup, false);
            r0 = new AnonymousClass32M(myStatusesActivity2, view3);
            view3.setTag(r0);
        } else {
            r0 = (AnonymousClass32M) view3.getTag();
        }
        AbstractC007503q r4 = (AbstractC007503q) this.A00.get(i);
        AnonymousClass0M4 r3 = null;
        if (r0 != null) {
            boolean z = r4 instanceof AnonymousClass0M3;
            if (z) {
                AnonymousClass0M4 r1 = ((AnonymousClass0M3) r4).A02;
                if (r1 != null) {
                    File file = r1.A0F;
                    if (file == null || !file.exists()) {
                        MyStatusesActivity myStatusesActivity3 = r0.A09;
                        myStatusesActivity3.A0l.A09(r4, r0.A07, myStatusesActivity3.A07);
                    } else {
                        MyStatusesActivity myStatusesActivity4 = r0.A09;
                        myStatusesActivity4.A0l.A0D(r4, r0.A07, myStatusesActivity4.A07, false);
                    }
                } else {
                    throw null;
                }
            } else if (r4.A0m == 0) {
                String A0D = r4.A0D();
                MyStatusesActivity myStatusesActivity5 = r0.A09;
                C02590Cr r11 = ((ActivityC004702f) myStatusesActivity5).A0M;
                AnonymousClass03P r12 = myStatusesActivity5.A0O;
                AnonymousClass022 r13 = myStatusesActivity5.A0d;
                if (A0D != null && A0D.length() > 700) {
                    A0D = A0D.substring(0, 700);
                }
                AnonymousClass1NQ r9 = new AnonymousClass1NQ(myStatusesActivity5, r11, r12, r13, A0D, ((C05490Ot) r4).A01);
                ContactStatusThumbnail contactStatusThumbnail = r0.A07;
                r9.A00 = ((ThumbnailButton) contactStatusThumbnail).A01 / 2.0f;
                contactStatusThumbnail.setImageDrawable(r9);
            } else {
                r0.A07.setImageResource(C10810fF.A00(r4));
            }
            if (C12080hW.A00(r4.A08, 4) >= 0) {
                long j = r4.A0D;
                if (j <= 0) {
                    j = r4.A0E;
                }
                textView = r0.A05;
                myStatusesActivity = r0.A09;
                r8 = ((AnonymousClass2C0) myStatusesActivity).A01;
                textView.setText(C002001d.A1F(r8, myStatusesActivity.A0P.A06(j)));
            } else if (!z || (r2 = ((AnonymousClass0M3) r4).A02) == null || r2.A0P || r2.A0a) {
                textView = r0.A05;
                myStatusesActivity = r0.A09;
                r8 = ((AnonymousClass2C0) myStatusesActivity).A01;
                textView.setText(r8.A06(R.string.sending_status_progress));
            } else {
                textView = r0.A05;
                myStatusesActivity = r0.A09;
                r8 = ((AnonymousClass2C0) myStatusesActivity).A01;
                textView.setText(r8.A06(R.string.sending_status_failed));
            }
            Map map = myStatusesActivity.A0s;
            C007303n r22 = r4.A0n;
            boolean containsKey = map.containsKey(r22);
            View view4 = r0.A00;
            int i2 = 0;
            if (containsKey) {
                i2 = R.color.home_row_selection;
            }
            view4.setBackgroundResource(i2);
            if (myStatusesActivity.A0t.remove(r22)) {
                r0.A08.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass32L(r0, containsKey));
            } else {
                r0.A08.A03(containsKey, false);
            }
            if (z) {
                r3 = ((AnonymousClass0M3) r4).A02;
            }
            if (r3 == null || r3.A0P || ((r4 instanceof AnonymousClass0ZC) && AnonymousClass0FI.A0u((AnonymousClass0ML) r4))) {
                if (!map.isEmpty()) {
                    imageView = r0.A03;
                    imageView.setVisibility(8);
                } else {
                    imageView = r0.A03;
                    imageView.setVisibility(0);
                    imageView.setContentDescription(r8.A06(R.string.my_status_more_options_content_description));
                }
                Number number = (Number) myStatusesActivity.A0q.get(r22);
                if (number == null) {
                    textView2 = r0.A06;
                    textView2.setVisibility(8);
                    MyStatusesActivity.A04(myStatusesActivity, r4, false);
                } else {
                    textView2 = r0.A06;
                    textView2.setVisibility(0);
                    long intValue = (long) number.intValue();
                    textView2.setContentDescription(r8.A0A(R.plurals.viewed_by, intValue, number));
                    textView2.setText(r8.A0A(R.plurals.number_of_views, intValue, number));
                }
                textView.setTextColor(C004302a.A00(view4.getContext(), R.color.list_item_sub_title));
                r0.A04.setVisibility(8);
                view2 = r0.A02;
                view2.setVisibility(8);
            } else {
                imageView = r0.A03;
                imageView.setVisibility(8);
                textView2 = r0.A06;
                textView2.setVisibility(8);
                boolean z2 = r3.A0a;
                Context context = view4.getContext();
                if (z2) {
                    textView.setTextColor(C004302a.A00(context, R.color.list_item_sub_title));
                    r0.A04.setVisibility(0);
                    view2 = r0.A02;
                    view2.setVisibility(8);
                } else {
                    textView.setTextColor(C004302a.A00(context, R.color.status_error));
                    r0.A04.setVisibility(8);
                    view2 = r0.A02;
                    view2.setVisibility(0);
                }
            }
            imageView.setTag(r4);
            textView2.setTag(r4);
            view2.setTag(r4);
            return view3;
        }
        throw null;
    }
}

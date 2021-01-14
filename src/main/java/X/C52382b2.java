package X;

import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2b2  reason: invalid class name and case insensitive filesystem */
public class C52382b2 extends AnonymousClass0JW {
    public final AnonymousClass01A A00;
    public final AnonymousClass08C A01;
    public final WeakReference A02;

    public C52382b2(C47732Ji r2, AnonymousClass01A r3, AnonymousClass08C r4) {
        this.A02 = new WeakReference(r2);
        this.A00 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractList abstractList;
        int intValue;
        String A0A;
        AnonymousClass02R r15 = (AnonymousClass02R) obj;
        C47732Ji r8 = (C47732Ji) this.A02.get();
        if (r8 != null) {
            r8.A01 = null;
            ConversationsFragment conversationsFragment = r8.A0A;
            View view = ((AnonymousClass037) conversationsFragment).A0A;
            ActivityC004902h A0A2 = conversationsFragment.A0A();
            if (view == null || A0A2 == null || A0A2.isFinishing() || r15 == null) {
                Log.w("conversations/updateNuxView: NUX view cannot be updated");
                return;
            }
            Log.d("conversations/updateNuxView: Creating NUX view based on preferred contact list");
            View findViewById = view.findViewById(R.id.conversations_empty_nux);
            Object obj2 = r15.A00;
            if (obj2 == null) {
                abstractList = new ArrayList();
            } else {
                abstractList = (AbstractList) obj2;
            }
            Object obj3 = r15.A01;
            if (obj3 == null) {
                intValue = 0;
            } else {
                intValue = ((Number) obj3).intValue();
            }
            int size = abstractList.size();
            int[] iArr = C47732Ji.A0D;
            int length = iArr.length;
            boolean z = false;
            if (size <= length) {
                z = true;
            }
            AnonymousClass00E.A07(z);
            if (Build.VERSION.SDK_INT <= 16) {
                Collections.reverse(abstractList);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                C007003k r13 = (C007003k) abstractList.get(i);
                ImageView imageView = (ImageView) findViewById.findViewById(iArr[i]);
                r8.A09.A02(r13, imageView);
                imageView.setVisibility(0);
                imageView.setOnClickListener(r8.A02);
                String A04 = r8.A07.A04(r13);
                arrayList.add(A04);
                imageView.setContentDescription(A04);
            }
            for (int i2 = size; i2 < length; i2++) {
                findViewById.findViewById(iArr[i2]).setVisibility(8);
            }
            if (!r8.A04) {
                int min = intValue - Math.min(size, 3);
                if (min > 0) {
                    AnonymousClass01X r82 = r8.A0B;
                    if (size == 0) {
                        A0A = r82.A0A(R.plurals.nux_abbreviated_prompt, (long) min, Integer.valueOf(min));
                    } else if (size == 1) {
                        A0A = r82.A0A(R.plurals.nux_one_more_contact_prompt, (long) min, arrayList.get(0), Integer.valueOf(min));
                    } else if (size != 2) {
                        A0A = r82.A0A(R.plurals.nux_three_more_contact_prompt, (long) min, arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.valueOf(min));
                    } else {
                        A0A = r82.A0A(R.plurals.nux_two_more_contact_prompt, (long) min, arrayList.get(0), arrayList.get(1), Integer.valueOf(min));
                    }
                } else if (size != 0) {
                    AnonymousClass01X r83 = r8.A0B;
                    if (size == 1) {
                        A0A = r83.A0D(R.string.nux_one_contact_prompt, arrayList.get(0));
                    } else if (size != 2) {
                        A0A = r83.A0D(R.string.nux_three_contact_prompt, arrayList.get(0), arrayList.get(1), arrayList.get(2));
                    } else {
                        A0A = r83.A0D(R.string.nux_two_contact_prompt, arrayList.get(0), arrayList.get(1));
                    }
                } else {
                    A0A = r8.A0B.A0A(R.plurals.nux_abbreviated_prompt, (long) min, Integer.valueOf(min));
                }
            } else {
                A0A = r8.A0B.A0A(R.plurals.nux_abbreviated_prompt, (long) intValue, Integer.valueOf(intValue));
            }
            TextView textView = (TextView) findViewById.findViewById(R.id.prompt_text);
            textView.setText(Html.fromHtml(A0A));
            textView.setVisibility(0);
            C002301g.A03((TextView) findViewById.findViewById(R.id.instruction_text));
        }
    }
}

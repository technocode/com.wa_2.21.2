package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Html;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.util.Map;

/* renamed from: X.2HI  reason: invalid class name */
public abstract class AnonymousClass2HI {
    public final int A00;
    public final Conversation A01;

    public AnonymousClass2HI(Conversation conversation, int i) {
        this.A01 = conversation;
        this.A00 = i;
    }

    public final void A00() {
        AnonymousClass2HJ r5 = this.A01.A0p;
        Class<?> cls = getClass();
        AnonymousClass2HI r3 = (AnonymousClass2HI) r5.A00.get(cls);
        if (r3 != null && r5.A01 != cls) {
            if (r5.A01 != null) {
                Map map = r5.A00;
                AnonymousClass2HI r0 = (AnonymousClass2HI) map.get(r5.A01);
                if (r0 != null && r0.A00 < r3.A00) {
                    Class cls2 = r5.A01;
                    if (cls2 != null) {
                        AnonymousClass2HI r1 = (AnonymousClass2HI) map.get(cls2);
                        if (cls2.equals(r5.A01) && r1 != null) {
                            r1.A01(new C51472Yw(r5), false);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            if (r5.A01 == null && r3.A03()) {
                if (!(r3 instanceof AnonymousClass2Z5)) {
                    AnonymousClass2Z2 r32 = (AnonymousClass2Z2) r3;
                    ViewGroup viewGroup = r32.A01;
                    if (viewGroup.getVisibility() != 0) {
                        boolean z = false;
                        if (viewGroup.getChildCount() > 0) {
                            z = true;
                        }
                        if (!(r32 instanceof C59002mt)) {
                            C58972mq r6 = (C58972mq) r32;
                            ViewGroup viewGroup2 = ((AnonymousClass2Z2) r6).A01;
                            if (viewGroup2.findViewById(R.id.group_description_text) == null) {
                                viewGroup2.removeAllViews();
                                ((AnonymousClass2HI) r6).A01.getLayoutInflater().inflate(R.layout.conversation_group_description, viewGroup2, true);
                                viewGroup2.findViewById(R.id.group_description_close).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(r6, 11));
                            }
                            r6.A06();
                        } else {
                            C59002mt r10 = (C59002mt) r32;
                            ViewGroup viewGroup3 = ((AnonymousClass2Z2) r10).A01;
                            if (viewGroup3.findViewById(R.id.app_update_banner_text) == null) {
                                viewGroup3.removeAllViews();
                                Conversation conversation = ((AnonymousClass2HI) r10).A01;
                                conversation.getLayoutInflater().inflate(R.layout.conversation_app_update_banner, viewGroup3, true);
                                ImageView imageView = (ImageView) viewGroup3.findViewById(R.id.app_update_banner_close);
                                imageView.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(r10, 13));
                                C002001d.A2m(imageView, C004302a.A00(conversation, R.color.banner_close_icon_color));
                                viewGroup3.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(r10, 14));
                                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) conversation.findViewById(R.id.app_update_banner_text);
                                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(Html.fromHtml(r10.A04.A06(R.string.conversation_app_update_banner_text)));
                                r10.A05.A02(conversation, newSpannable);
                                textEmojiLabel.setAccessibilityHelper(new C05720Pu(textEmojiLabel));
                                textEmojiLabel.A04(newSpannable, null, false, 0);
                            }
                        }
                        AnonymousClass0S2 A09 = ((AnonymousClass2HI) r32).A01.A09();
                        if (A09 != null) {
                            A09.A02(0.0f);
                            AnonymousClass0Q7.A0Q(viewGroup, r32.A00);
                            viewGroup.setVisibility(0);
                            if (z) {
                                viewGroup.postDelayed(new RunnableEBaseShape8S0100000_I1_3(viewGroup, 49), 10);
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    AnonymousClass2Z5 r33 = (AnonymousClass2Z5) r3;
                    if (r33.A00 == null) {
                        r33.A00 = ((AnonymousClass2HI) r33).A01.getLayoutInflater().inflate(R.layout.change_number_notification, r33.A04).findViewById(R.id.change_number_notification);
                        r33.A05();
                        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                        translateAnimation.setAnimationListener(new AnonymousClass2Z3(r33));
                        translateAnimation.setDuration(400);
                        View view = r33.A00;
                        if (view != null) {
                            view.startAnimation(translateAnimation);
                        } else {
                            throw null;
                        }
                    }
                }
                r5.A01 = cls;
            }
        }
    }

    public void A01(C51472Yw r17, boolean z) {
        if (!(this instanceof AnonymousClass2Z5)) {
            AnonymousClass2Z2 r6 = (AnonymousClass2Z2) this;
            if (z) {
                Conversation conversation = ((AnonymousClass2HI) r6).A01;
                if (conversation.A1H()) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
                    translateAnimation.setDuration(220);
                    translateAnimation.setInterpolator(new AccelerateInterpolator());
                    r6.A01.startAnimation(translateAnimation);
                    r6.A05(r17);
                    return;
                }
                ViewGroup viewGroup = r6.A01;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", 0.0f, (float) (-viewGroup.getHeight()));
                ListView A0T = conversation.A0T();
                ObjectAnimator ofInt = ObjectAnimator.ofInt(A0T, "Top", A0T.getTop(), A0T.getTop() - viewGroup.getHeight());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofInt);
                animatorSet.addListener(new AnonymousClass2HE(r6, r17));
                animatorSet.setDuration(220L).start();
                return;
            }
            r6.A05(r17);
            return;
        }
        AnonymousClass2Z5 r2 = (AnonymousClass2Z5) this;
        if (z) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation2.setAnimationListener(new AnonymousClass2Z4(r2, r17));
            translateAnimation2.setDuration(400);
            View view = r2.A00;
            if (view != null) {
                view.startAnimation(translateAnimation2);
                return;
            }
            throw null;
        }
        r2.A06(r17);
    }

    public final void A02(boolean z) {
        AnonymousClass2HJ r3 = this.A01.A0p;
        Class<?> cls = getClass();
        AnonymousClass2HI r1 = (AnonymousClass2HI) r3.A00.get(cls);
        if (cls.equals(r3.A01) && r1 != null) {
            r1.A01(new C51472Yw(r3), z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2HI.A03():boolean");
    }

    public final boolean A04() {
        AnonymousClass2HJ r2 = this.A01.A0p;
        return r2.A01 != null && r2.A00.get(r2.A01) == this;
    }
}

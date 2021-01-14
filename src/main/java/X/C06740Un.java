package X;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.views.TokenizedSearchInput;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Un  reason: invalid class name and case insensitive filesystem */
public final class C06740Un extends View.AccessibilityDelegate {
    public final AnonymousClass0Q0 A00;

    public C06740Un(AnonymousClass0Q0 r1) {
        this.A00 = r1;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Zj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r3) {
        /*
            r2 = this;
            X.0Q0 r1 = r2.A00
            boolean r0 = r1 instanceof X.AnonymousClass0Pz
            if (r0 != 0) goto L_0x001c
            android.view.View$AccessibilityDelegate r0 = r1.A01
            android.view.accessibility.AccessibilityNodeProvider r1 = r0.getAccessibilityNodeProvider(r3)
            if (r1 == 0) goto L_0x001a
            X.0Zj r0 = new X.0Zj
            r0.<init>(r1)
        L_0x0013:
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.A00
            android.view.accessibility.AccessibilityNodeProvider r0 = (android.view.accessibility.AccessibilityNodeProvider) r0
            return r0
        L_0x001a:
            r0 = 0
            goto L_0x0013
        L_0x001c:
            X.0Pz r1 = (X.AnonymousClass0Pz) r1
            X.0Zk r0 = r1.A02
            if (r0 != 0) goto L_0x0013
            X.0Zk r0 = new X.0Zk
            r0.<init>(r1)
            r1.A02 = r0
            goto L_0x0013
        L_0x002a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06740Un.getAccessibilityNodeProvider(android.view.View):android.view.accessibility.AccessibilityNodeProvider");
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C07850Zx r0;
        Runnable runnable;
        AnonymousClass0YE r02;
        AnonymousClass0VT r2;
        AnonymousClass0Q0 r22 = this.A00;
        if (r22 instanceof C07770Zl) {
            C07770Zl r23 = (C07770Zl) r22;
            r23.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 65536 && (runnable = (r0 = r23.A00).A01) != null) {
                r0.A05.removeCallbacks(runnable);
            }
        } else if (r22 instanceof C07780Zm) {
            C07780Zm r24 = (C07780Zm) r22;
            r24.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            TokenizedSearchInput tokenizedSearchInput = r24.A00;
            if (C002001d.A3H(tokenizedSearchInput.A09.A0G()) && accessibilityEvent.getEventType() == 1) {
                TokenizedSearchInput.A00(tokenizedSearchInput, view);
            }
        } else if (r22 instanceof C07790Zn) {
            C07790Zn r25 = (C07790Zn) r22;
            r25.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(r25.A00.isChecked());
        } else if (r22 instanceof C07740Zi) {
            C07740Zi r26 = (C07740Zi) r22;
            r26.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = r26.A00;
            AnonymousClass0YE r03 = viewPager.A0V;
            boolean z = true;
            if (r03 == null || r03.A01() <= 1) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && (r02 = viewPager.A0V) != null) {
                accessibilityEvent.setItemCount(r02.A01());
                accessibilityEvent.setFromIndex(viewPager.A0A);
                accessibilityEvent.setToIndex(viewPager.A0A);
            }
        } else if (r22 instanceof C07800Zo) {
            C07800Zo r27 = (C07800Zo) r22;
            ((AnonymousClass0Q0) r27).A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RecyclerView.class.getName());
            if ((view instanceof RecyclerView) && !r27.A03() && (r2 = ((RecyclerView) view).A0S) != null) {
                if (r2 instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r2;
                    staggeredGridLayoutManager.A0V(accessibilityEvent);
                    if (staggeredGridLayoutManager.A0A() > 0) {
                        View A12 = staggeredGridLayoutManager.A12(false);
                        View A11 = staggeredGridLayoutManager.A11(false);
                        if (A12 != null && A11 != null) {
                            int A06 = AnonymousClass0VT.A06(A12);
                            int A062 = AnonymousClass0VT.A06(A11);
                            if (A06 < A062) {
                                accessibilityEvent.setFromIndex(A06);
                                accessibilityEvent.setToIndex(A062);
                                return;
                            }
                            accessibilityEvent.setFromIndex(A062);
                            accessibilityEvent.setToIndex(A06);
                        }
                    }
                } else if (!(r2 instanceof LinearLayoutManager)) {
                    r2.A0V(accessibilityEvent);
                } else {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r2;
                    linearLayoutManager.A0V(accessibilityEvent);
                    if (linearLayoutManager.A0A() > 0) {
                        accessibilityEvent.setFromIndex(linearLayoutManager.A0s());
                        accessibilityEvent.setToIndex(linearLayoutManager.A0u());
                    }
                }
            }
        } else if (!(r22 instanceof C07810Zp)) {
            r22.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            r22.A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            boolean z2 = false;
            if (nestedScrollView.getScrollRange() > 0) {
                z2 = true;
            }
            accessibilityEvent.setScrollable(z2);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean booleanValue;
        boolean booleanValue2;
        int length;
        int i;
        C07890a3 r6 = new C07890a3(accessibilityNodeInfo);
        Boolean bool = (Boolean) new C07900a4().A00(view);
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            r6.A02.setScreenReaderFocusable(booleanValue);
        } else {
            r6.A05(1, booleanValue);
        }
        Boolean bool2 = (Boolean) new C06770Uq().A00(view);
        if (bool2 == null) {
            booleanValue2 = false;
        } else {
            booleanValue2 = bool2.booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            r6.A02.setHeading(booleanValue2);
        } else {
            r6.A05(2, booleanValue2);
        }
        CharSequence charSequence = (CharSequence) new C06750Uo().A00(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            r6.A02.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            r6.A02.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        this.A00.A01(view, r6);
        CharSequence text = accessibilityNodeInfo.getText();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19 && i3 < 26) {
            if (i3 >= 19) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = r6.A02;
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo2.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            }
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((Reference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Number) arrayList.get(i5)).intValue());
                }
            }
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, text.length(), ClickableSpan.class);
                if (clickableSpanArr != null && (length = clickableSpanArr.length) > 0) {
                    r6.A01().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i6 = 0; i6 < length; i6++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i = C07890a3.A03;
                                C07890a3.A03 = i + 1;
                                break;
                            } else if (clickableSpan.equals(((Reference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            } else {
                                i7++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                        r6.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        r6.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        r6.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        r6.A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            r6.A06((C06790Us) list.get(i8));
        }
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        AnonymousClass0Q0 r1 = this.A00;
        if (r1 instanceof C07910a5) {
            view.setLongClickable(false);
        } else if (!(r1 instanceof C07920a6)) {
            r1.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            C07920a6 r12 = (C07920a6) r1;
            r12.A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
            TextInputLayout textInputLayout = r12.A00;
            EditText editText = textInputLayout.A0L;
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = textInputLayout.getHint();
            }
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityEvent.getText().add(charSequence);
            }
        }
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.A00.A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.A00.A02(view, i, bundle);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.A00.A00(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.A00.A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}

package com.whatsapp;

import X.AbstractC07350Xf;
import X.AbstractC16300pa;
import X.AnonymousClass008;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass020;
import X.AnonymousClass022;
import X.AnonymousClass02U;
import X.AnonymousClass02Y;
import X.AnonymousClass03P;
import X.AnonymousClass0JW;
import X.AnonymousClass0Z6;
import X.AnonymousClass1M5;
import X.AnonymousClass1MA;
import X.AnonymousClass1MU;
import X.AnonymousClass1MV;
import X.AnonymousClass1MW;
import X.AnonymousClass1MX;
import X.AnonymousClass1MZ;
import X.AnonymousClass1VY;
import X.AnonymousClass1t2;
import X.C004302a;
import X.C006803i;
import X.C05350Oe;
import X.C09580dB;
import X.C28351Tz;
import X.C38761qP;
import X.C40291sx;
import X.C40301sy;
import X.C40311sz;
import X.C40321t0;
import X.C60672pw;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MentionableEntry extends C60672pw implements AnonymousClass1MU, AnonymousClass1MV, AbstractC07350Xf {
    public static final String[] A0K = AnonymousClass1MA.A01;
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public View A04;
    public ViewGroup A05;
    public AnonymousClass1MU A06;
    public MentionPickerView A07;
    public C40311sz A08;
    public AnonymousClass1MX A09;
    public AnonymousClass02U A0A;
    public boolean A0B;
    public boolean A0C;
    public final TextWatcher A0D;
    public final AnonymousClass0Z6 A0E;
    public final AnonymousClass01A A0F;
    public final AnonymousClass03P A0G;
    public final AnonymousClass01T A0H;
    public final C09580dB A0I;
    public final AnonymousClass022 A0J;

    public MentionableEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass0Z6 A002;
        AnonymousClass01A A003;
        AnonymousClass03P A004;
        AnonymousClass01T r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass0Z6.A00();
        }
        this.A0E = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass01A.A00();
        }
        this.A0F = A003;
        if (isInEditMode()) {
            A004 = null;
        } else {
            A004 = AnonymousClass03P.A00();
        }
        this.A0G = A004;
        this.A0H = !isInEditMode() ? AnonymousClass01T.A00() : r1;
        this.A0J = AnonymousClass022.A00();
        this.A0I = new C09580dB();
        this.A0D = new AnonymousClass1MW(this);
    }

    public static final int A00(int i, Editable editable) {
        C40321t0[] r6 = (C40321t0[]) editable.getSpans(i, i, C40321t0.class);
        for (C40321t0 r1 : r6) {
            int spanStart = editable.getSpanStart(r1) - 1;
            int spanEnd = editable.getSpanEnd(r1);
            i = spanEnd;
            if (i <= ((spanStart + spanEnd) >> 1)) {
                i = spanStart;
            }
        }
        return i;
    }

    public final int A04(Editable editable, int i) {
        int lastIndexOf = editable.toString().substring(i, getSelectionEnd()).lastIndexOf("@");
        for (C40311sz r0 : (C40311sz[]) editable.getSpans(lastIndexOf, lastIndexOf + 1, C40311sz.class)) {
            if (r0.A00) {
                return -1;
            }
        }
        return lastIndexOf;
    }

    public final String A05(int i, int i2) {
        Editable newEditable = Editable.Factory.getInstance().newEditable(getText().subSequence(i, i2));
        C40321t0[] r5 = (C40321t0[]) newEditable.getSpans(0, newEditable.length(), C40321t0.class);
        for (C40321t0 r3 : r5) {
            newEditable.replace(newEditable.getSpanStart(r3) - 1, newEditable.getSpanEnd(r3), r3.A01);
        }
        return newEditable.toString();
    }

    public void A06() {
        removeTextChangedListener(this.A0D);
        setText((String) null);
        setCursorVisible(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r1 != '_') goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.text.Editable r8) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MentionableEntry.A07(android.text.Editable):void");
    }

    public final void A08(Editable editable, int i) {
        int i2 = i + 1;
        if (((C40311sz[]) editable.getSpans(i, i2, C40311sz.class)).length < 1) {
            A0A(this.A08);
            C40311sz r1 = new C40311sz(this.A00, false);
            this.A08 = r1;
            editable.setSpan(r1, i, i2, 33);
        }
    }

    public final void A09(SpannableStringBuilder spannableStringBuilder, Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (userJid != null) {
                AnonymousClass0Z6 r1 = this.A0E;
                if (r1 != null) {
                    AnonymousClass01A r0 = this.A0F;
                    if (r0 != null) {
                        String A022 = r1.A02(r0.A0A(userJid));
                        String A0H2 = C006803i.A0H(userJid);
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, A0H2);
                        if (indexOf < 0) {
                            StringBuilder sb = new StringBuilder("unable to set mention for ");
                            sb.append(userJid);
                            sb.append(" in ");
                            sb.append((Object) spannableStringBuilder);
                            Log.w(sb.toString());
                        } else {
                            do {
                                spannableStringBuilder.replace(indexOf, A0H2.length() + indexOf, AnonymousClass008.A0K("@", A022));
                                if (z) {
                                    C40311sz r4 = new C40311sz(this.A00, true);
                                    int i = indexOf + 1;
                                    spannableStringBuilder.setSpan(r4, indexOf, i, 33);
                                    spannableStringBuilder.setSpan(new C40321t0(this.A01, A0H2, r4), i, A022.length() + i, 33);
                                }
                                indexOf = TextUtils.indexOf(spannableStringBuilder, A0H2, indexOf + 1);
                            } while (indexOf >= 0);
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public final void A0A(ForegroundColorSpan foregroundColorSpan) {
        if (foregroundColorSpan != null) {
            getText().removeSpan(foregroundColorSpan);
        }
    }

    public void A0B(ViewGroup viewGroup, AnonymousClass02U r5, boolean z, boolean z2) {
        this.A0A = r5;
        addTextChangedListener(this.A0D);
        this.A01 = C004302a.A00(getContext(), R.color.link_color);
        this.A00 = C004302a.A00(getContext(), R.color.mention_annotation_on_white);
        A07(getText());
        this.A05 = viewGroup;
        Bundle bundle = new Bundle();
        this.A03 = bundle;
        bundle.putString("ARG_GID", AnonymousClass1VY.A0D(r5));
        this.A03.putBoolean("ARG_IS_DARK_THEME", z);
        this.A03.putBoolean("ARG_HIDE_END_DIVIDER", z2);
    }

    public final void A0C(String str) {
        if (this.A05 != null) {
            MentionPickerView mentionPickerView = this.A07;
            if (str != null) {
                if (mentionPickerView == null) {
                    MentionPickerView mentionPickerView2 = (MentionPickerView) LayoutInflater.from(getContext()).inflate(R.layout.mentions_list, this.A05, false);
                    this.A07 = mentionPickerView2;
                    this.A05.addView(mentionPickerView2);
                    MentionPickerView mentionPickerView3 = this.A07;
                    Bundle bundle = this.A03;
                    if (mentionPickerView3 != null) {
                        AnonymousClass02U A032 = AnonymousClass02U.A03(bundle.getString("ARG_GID"));
                        boolean z = bundle.getBoolean("ARG_IS_DARK_THEME");
                        boolean z2 = bundle.getBoolean("ARG_HIDE_END_DIVIDER");
                        mentionPickerView3.A03 = A032;
                        RecyclerView recyclerView = (RecyclerView) mentionPickerView3.findViewById(R.id.list);
                        mentionPickerView3.A00 = recyclerView;
                        mentionPickerView3.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        mentionPickerView3.setVisibility(8);
                        if (!z) {
                            mentionPickerView3.setBackgroundResource(R.drawable.ib_new_expanded_top);
                        } else {
                            mentionPickerView3.setBackgroundColor(C004302a.A00(mentionPickerView3.getContext(), R.color.mention_picker_dark_theme_background));
                        }
                        AnonymousClass01I r6 = mentionPickerView3.A06;
                        if (r6 != null) {
                            r6.A04();
                            mentionPickerView3.A04 = r6.A03;
                            mentionPickerView3.A02 = new AnonymousClass1t2(mentionPickerView3.getContext(), mentionPickerView3.A07, r6, mentionPickerView3.A0A, mentionPickerView3.A09, mentionPickerView3.A0B, mentionPickerView3.A0D, this, z, z2);
                            mentionPickerView3.A03();
                            ((AbstractC16300pa) mentionPickerView3.A02).A01.registerObserver(new C40291sx(mentionPickerView3));
                            mentionPickerView3.A00.setAdapter(mentionPickerView3.A02);
                            View view = this.A04;
                            if (view != null) {
                                this.A07.setAnchorWidthView(view);
                            }
                            mentionPickerView = this.A07;
                            mentionPickerView.A01 = this;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                if (mentionPickerView.A05) {
                    mentionPickerView.A02.getFilter().filter(str);
                    return;
                }
                C40301sy r3 = new C40301sy(mentionPickerView, mentionPickerView.A04, str);
                ((AnonymousClass0JW) r3).A00.execute(mentionPickerView.A03);
            } else if (mentionPickerView != null) {
                mentionPickerView.A02.getFilter().filter(null);
            }
        }
    }

    public final void A0D(boolean z) {
        int i;
        boolean z2 = this.A0B;
        if (z2 != z) {
            if (!z2) {
                this.A02 = getInputType();
            }
            this.A0B = z;
            if (z) {
                i = 147457;
            } else {
                i = this.A02;
            }
            setInputType(i);
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart != -1 && selectionEnd != -1) {
                setSelection(selectionStart, selectionEnd);
            }
        }
    }

    @Override // X.AnonymousClass1MU
    public void ADw(boolean z) {
        int A042;
        this.A0C = z;
        AnonymousClass1MU r0 = this.A06;
        if (r0 != null) {
            r0.ADw(z);
        }
        if (!z || (A042 = A04(getEditableText(), 0)) < 0) {
            A0A(this.A08);
            this.A08 = null;
            return;
        }
        A08(getEditableText(), A042);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0I.A00();
    }

    public List getMentions() {
        HashSet hashSet = new HashSet();
        for (C40321t0 r0 : (C40321t0[]) getText().getSpans(0, getText().length(), C40321t0.class)) {
            try {
                hashSet.add(UserJid.getFromIdentifier(r0.A01.substring(1)));
            } catch (AnonymousClass02Y unused) {
            }
        }
        return new ArrayList(hashSet);
    }

    public String getStringText() {
        return A05(0, getText().length());
    }

    @Override // X.AbstractC463429i, X.C07670Zb, com.whatsapp.WaEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = A0K;
        if (strArr.length <= 0) {
            return onCreateInputConnection;
        }
        EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        Log.d("mentionable/entry/onCreateInputConnection: returning wrapper");
        return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, new C38761qP(this));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass1MZ r6 = (AnonymousClass1MZ) parcelable;
        super.onRestoreInstanceState(r6.getSuperState());
        String str = r6.A00;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                if (str2 != null) {
                    setMentionableText(str2, C006803i.A0O(str));
                    setSelection(selectionStart, selectionEnd);
                    return;
                }
                throw null;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            return new AnonymousClass1MZ(onSaveInstanceState, getStringText(), C006803i.A0M(getMentions()));
        }
        throw null;
    }

    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable editableText = getEditableText();
        if (!TextUtils.isEmpty(editableText)) {
            setSelection(A00(i, editableText), A00(i2, editableText));
        }
    }

    @Override // X.C60672pw, com.whatsapp.WaEditText
    public boolean onTextContextMenuItem(int i) {
        int i2;
        CharSequence charSequence;
        int length = getText().length();
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            length = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i2 = 0;
        }
        if (i == 16908322) {
            if (this.A0A != null) {
                AnonymousClass03P r0 = this.A0G;
                if (r0 != null) {
                    ClipboardManager A052 = r0.A05();
                    if (A052 == null) {
                        Log.w("mentionableentry/on-text-context-menu-item cm=null");
                        return super.onTextContextMenuItem(i);
                    }
                    ClipData primaryClip = A052.getPrimaryClip();
                    if (primaryClip == null || primaryClip.getItemCount() == 0) {
                        return super.onTextContextMenuItem(i);
                    }
                    ClipData.Item itemAt = primaryClip.getItemAt(0);
                    if (itemAt != null) {
                        charSequence = itemAt.getText();
                    } else {
                        charSequence = "";
                    }
                    SharedPreferences A012 = this.A0J.A01(AnonymousClass020.A02);
                    String string = A012.getString("copied_message", "");
                    String string2 = A012.getString("copied_message_jids", "");
                    String string3 = A012.getString("copied_message_without_mentions", "");
                    if (TextUtils.isEmpty(charSequence) || !TextUtils.equals(charSequence, string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                        return super.onTextContextMenuItem(i);
                    }
                    List A0O = C006803i.A0O(string2);
                    HashSet hashSet = new HashSet(A0O);
                    HashSet hashSet2 = new HashSet(A0O);
                    AnonymousClass02U r1 = this.A0A;
                    if (r1 != null) {
                        AnonymousClass01T r02 = this.A0H;
                        if (r02 != null) {
                            C05350Oe A042 = r02.A01(r1).A04();
                            HashSet hashSet3 = new HashSet();
                            Iterator it = A042.iterator();
                            while (true) {
                                C28351Tz r12 = (C28351Tz) it;
                                if (!r12.hasNext()) {
                                    break;
                                }
                                hashSet3.add(((AnonymousClass1M5) r12.next()).A03);
                            }
                            hashSet.retainAll(hashSet3);
                            hashSet2.removeAll(hashSet3);
                        } else {
                            throw null;
                        }
                    } else {
                        hashSet2 = null;
                    }
                    if (string3 != null) {
                        if (this.A0C) {
                            A0C(null);
                        }
                        A0A(this.A08);
                        this.A08 = null;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                        A09(spannableStringBuilder, hashSet, true);
                        if (hashSet2 != null) {
                            A09(spannableStringBuilder, hashSet2, false);
                        }
                        getText().replace(i2, length, spannableStringBuilder);
                        return true;
                    }
                    throw null;
                }
                throw null;
            }
        } else if (i == 16908320 || i == 16908321) {
            this.A0J.A01(AnonymousClass020.A02).edit().putString("copied_message_without_mentions", A05(i2, length)).putString("copied_message", getText().subSequence(i2, length).toString()).putString("copied_message_jids", C006803i.A0M(getMentions())).apply();
        }
        return super.onTextContextMenuItem(i);
    }

    public void setMentionPickerVisibilityChangeListener(AnonymousClass1MU r1) {
        this.A06 = r1;
    }

    public void setMentionableText(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            setText(str);
            return;
        }
        if (this.A0C) {
            A0C(null);
        }
        A0A(this.A08);
        this.A08 = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        A09(spannableStringBuilder, collection, true);
        setText(spannableStringBuilder);
    }

    public void setOnCommitContentListener(AnonymousClass1MX r1) {
        this.A09 = r1;
    }

    public void setText(String str) {
        C40321t0[] r3 = (C40321t0[]) getText().getSpans(0, getText().length(), C40321t0.class);
        for (C40321t0 r1 : r3) {
            A0A(r1.A00);
            A0A(r1);
        }
        A0A(this.A08);
        this.A08 = null;
        super.setText((CharSequence) str);
    }
}

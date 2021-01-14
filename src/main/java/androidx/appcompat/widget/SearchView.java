package androidx.appcompat.widget;

import X.AbstractC13480kJ;
import X.AbstractC13490kK;
import X.AbstractC15200nf;
import X.AbstractC30161ar;
import X.AnonymousClass0N2;
import X.AnonymousClass0T3;
import X.AnonymousClass0TL;
import X.AnonymousClass0YO;
import X.AnonymousClass0YR;
import X.AnonymousClass28L;
import X.C07530Ya;
import X.C13400kB;
import X.C13440kF;
import X.C13450kG;
import X.C13460kH;
import X.C13470kI;
import X.C13510kM;
import X.C29661Zx;
import X.C459227b;
import X.View$OnFocusChangeListenerC13410kC;
import X.View$OnKeyListenerC13430kE;
import X.View$OnLayoutChangeListenerC13420kD;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements AnonymousClass0YO {
    public static final C13470kI A0o = new C13470kI();
    public int A00;
    public int A01;
    public SearchableInfo A02;
    public Rect A03;
    public Rect A04;
    public Bundle A05;
    public TextWatcher A06;
    public View.OnClickListener A07;
    public View.OnFocusChangeListener A08;
    public View.OnKeyListener A09;
    public AbstractC13480kJ A0A;
    public AnonymousClass0YR A0B;
    public AbstractC13490kK A0C;
    public C13510kM A0D;
    public AbstractC30161ar A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Runnable A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int[] A0Q;
    public int[] A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View.OnClickListener A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final View A0b;
    public final AdapterView.OnItemClickListener A0c;
    public final AdapterView.OnItemSelectedListener A0d;
    public final ImageView A0e;
    public final ImageView A0f;
    public final ImageView A0g;
    public final ImageView A0h;
    public final ImageView A0i;
    public final TextView.OnEditorActionListener A0j;
    public final SearchAutoComplete A0k;
    public final CharSequence A0l;
    public final Runnable A0m;
    public final WeakHashMap A0n;

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = new Rect();
        this.A04 = new Rect();
        this.A0Q = new int[2];
        this.A0R = new int[2];
        this.A0m = new RunnableEBaseShape0S0100000_I0_0(this, 4);
        this.A0I = new RunnableEBaseShape0S0100000_I0_0(this, 5);
        this.A0n = new WeakHashMap();
        this.A0X = new ViewOnClickEBaseShape0S0100000_I0_0(this, 1);
        this.A09 = new View$OnKeyListenerC13430kE(this);
        this.A0j = new C13440kF(this);
        this.A0c = new C13450kG(this);
        this.A0d = new C13460kH(this);
        this.A06 = new C13400kB(this);
        AnonymousClass0TL r5 = new AnonymousClass0TL(context, context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0W, i, 0));
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray typedArray = r5.A02;
        from.inflate(typedArray.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.A0k = searchAutoComplete;
        searchAutoComplete.A01 = this;
        this.A0Z = findViewById(R.id.search_edit_frame);
        this.A0a = findViewById(R.id.search_plate);
        this.A0b = findViewById(R.id.submit_area);
        this.A0h = (ImageView) findViewById(R.id.search_button);
        this.A0g = (ImageView) findViewById(R.id.search_go_btn);
        this.A0e = (ImageView) findViewById(R.id.search_close_btn);
        this.A0i = (ImageView) findViewById(R.id.search_voice_btn);
        this.A0f = (ImageView) findViewById(R.id.search_mag_icon);
        this.A0a.setBackground(r5.A02(10));
        this.A0b.setBackground(r5.A02(14));
        this.A0h.setImageDrawable(r5.A02(13));
        this.A0g.setImageDrawable(r5.A02(7));
        this.A0e.setImageDrawable(r5.A02(4));
        this.A0i.setImageDrawable(r5.A02(16));
        this.A0f.setImageDrawable(r5.A02(13));
        this.A0W = r5.A02(12);
        AnonymousClass0N2.A19(this.A0h, getResources().getString(R.string.abc_searchview_description_search));
        this.A0T = typedArray.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.A0S = typedArray.getResourceId(5, 0);
        this.A0h.setOnClickListener(this.A0X);
        this.A0e.setOnClickListener(this.A0X);
        this.A0g.setOnClickListener(this.A0X);
        this.A0i.setOnClickListener(this.A0X);
        this.A0k.setOnClickListener(this.A0X);
        this.A0k.addTextChangedListener(this.A06);
        this.A0k.setOnEditorActionListener(this.A0j);
        this.A0k.setOnItemClickListener(this.A0c);
        this.A0k.setOnItemSelectedListener(this.A0d);
        this.A0k.setOnKeyListener(this.A09);
        this.A0k.setOnFocusChangeListener(new View$OnFocusChangeListenerC13410kC(this));
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.A0l = typedArray.getText(6);
        this.A0G = typedArray.getText(11);
        int i2 = typedArray.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(0, true));
        typedArray.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.A0V = intent;
        intent.addFlags(268435456);
        this.A0V.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.A0U = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.A0k.getDropDownAnchor());
        this.A0Y = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC13420kD(this));
        }
        A0G(this.A0M);
        A09();
    }

    public final Intent A03(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.A0H);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.A05;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A02.getSearchActivity());
        return intent;
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0k.refreshAutoCompleteResults();
            return;
        }
        C13470kI r4 = A0o;
        SearchAutoComplete searchAutoComplete = this.A0k;
        Method method = r4.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        Method method2 = r4.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void A05() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.A0M) {
            AbstractC13480kJ r0 = this.A0A;
            if (r0 == null || !r0.AEH()) {
                clearFocus();
                A0G(true);
            }
        }
    }

    public void A06() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            AnonymousClass0YR r1 = this.A0B;
            if (r1 == null || !r1.AIz(text.toString())) {
                if (this.A02 != null) {
                    getContext().startActivity(A03("android.intent.action.SEARCH", null, null, text.toString()));
                }
                searchAutoComplete.setImeVisibility(false);
                searchAutoComplete.dismissDropDown();
            }
        }
    }

    public void A07() {
        int[] iArr;
        if (this.A0k.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.A0a.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0b.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void A08() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A0k.getText());
        int i = 0;
        if (!z2 && (!this.A0M || this.A0K)) {
            z = false;
        }
        ImageView imageView = this.A0e;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void A09() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A0M && (drawable = this.A0W) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void A0A() {
        int i;
        if ((this.A0O || this.A0P) && !A0H() && (this.A0g.getVisibility() == 0 || this.A0i.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.A0b.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r8 == null) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(int r10) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.A0B(int):void");
    }

    public void A0C(int i) {
        Editable text = this.A0k.getText();
        Cursor cursor = this.A0E.A02;
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i)) {
            CharSequence A36 = this.A0E.A36(cursor);
            if (A36 != null) {
                setQuery(A36);
            } else {
                setQuery(text);
            }
        } else {
            setQuery(text);
        }
    }

    public void A0D(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void A0E(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.A0H = charSequence;
        }
    }

    public final void A0F(boolean z) {
        int i;
        boolean z2 = this.A0O;
        if (!z2 || ((!z2 && !this.A0P) || A0H() || !hasFocus() || (!z && this.A0P))) {
            i = 8;
        } else {
            i = 0;
        }
        this.A0g.setVisibility(i);
    }

    public final void A0G(boolean z) {
        this.A0L = z;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        boolean z2 = !TextUtils.isEmpty(this.A0k.getText());
        this.A0h.setVisibility(i2);
        A0F(z2);
        View view = this.A0Z;
        int i3 = 0;
        if (z) {
            i3 = 8;
        }
        view.setVisibility(i3);
        ImageView imageView = this.A0f;
        if (imageView.getDrawable() == null || this.A0M) {
            i = 8;
        }
        imageView.setVisibility(i);
        A08();
        boolean z3 = !z2;
        int i4 = 8;
        if (this.A0P && !A0H() && z3) {
            this.A0g.setVisibility(8);
            i4 = 0;
        }
        this.A0i.setVisibility(i4);
        A0A();
    }

    public boolean A0H() {
        if (!(this instanceof C459227b)) {
            return this.A0L;
        }
        return false;
    }

    public void clearFocus() {
        this.A0J = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0J = false;
    }

    public int getImeOptions() {
        return this.A0k.getImeOptions();
    }

    public int getInputType() {
        return this.A0k.getInputType();
    }

    public int getMaxWidth() {
        return this.A01;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    public CharSequence getQuery() {
        return this.A0k.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0G;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A02;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.A0l;
        }
        return getContext().getText(this.A02.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public AbstractC30161ar getSuggestionsAdapter() {
        return this.A0E;
    }

    @Override // X.AnonymousClass0YO
    public void onActionViewCollapsed() {
        A0E("");
        clearFocus();
        A0G(true);
        this.A0k.setImeOptions(this.A00);
        this.A0K = false;
    }

    @Override // X.AnonymousClass0YO
    public void onActionViewExpanded() {
        if (!this.A0K) {
            this.A0K = true;
            SearchAutoComplete searchAutoComplete = this.A0k;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A00 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0m);
        post(this.A0I);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0k;
            Rect rect = this.A03;
            searchAutoComplete.getLocationInWindow(this.A0Q);
            getLocationInWindow(this.A0R);
            int[] iArr = this.A0Q;
            int i5 = iArr[1];
            int[] iArr2 = this.A0R;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.A04;
            Rect rect3 = this.A03;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C13510kM r4 = this.A0D;
            Rect rect4 = this.A04;
            Rect rect5 = this.A03;
            if (r4 == null) {
                C13510kM r0 = new C13510kM(rect4, rect5, searchAutoComplete);
                this.A0D = r0;
                setTouchDelegate(r0);
                return;
            }
            r4.A04.set(rect4);
            Rect rect6 = r4.A03;
            rect6.set(rect4);
            int i8 = -r4.A01;
            rect6.inset(i8, i8);
            r4.A02.set(rect5);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        int i3;
        if (A0H()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.A01;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.A01;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.A01) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C29661Zx)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C29661Zx r2 = (C29661Zx) parcelable;
        super.onRestoreInstanceState(((AbstractC15200nf) r2).A00);
        A0G(r2.A00);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C29661Zx r1 = new C29661Zx(super.onSaveInstanceState());
        r1.A00 = A0H();
        return r1;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.A0m);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.A0J || !isFocusable()) {
            return false;
        }
        if (A0H()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.A0k.requestFocus(i, rect);
        if (requestFocus) {
            A0G(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.A05 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            A05();
            return;
        }
        A0G(false);
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A07;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A0M != z) {
            this.A0M = z;
            A0G(z);
            A09();
        }
    }

    public void setImeOptions(int i) {
        this.A0k.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0k.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setOnCloseListener(AbstractC13480kJ r1) {
        this.A0A = r1;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A08 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AnonymousClass0YR r1) {
        this.A0B = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A07 = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC13490kK r1) {
        this.A0C = r1;
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0G = charSequence;
        A09();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0N = z;
        AbstractC30161ar r1 = this.A0E;
        if (r1 instanceof AnonymousClass28L) {
            AnonymousClass28L r12 = (AnonymousClass28L) r1;
            int i = 1;
            if (z) {
                i = 2;
            }
            r12.A03 = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (getContext().getPackageManager().resolveActivity(r1, 65536) != null) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0O = z;
        A0G(A0H());
    }

    public void setSuggestionsAdapter(AbstractC30161ar r2) {
        this.A0E = r2;
        this.A0k.setAdapter(r2);
    }

    public class SearchAutoComplete extends C07530Ya {
        public int A00 = getThreshold();
        public SearchView A01;
        public boolean A02;
        public final Runnable A03 = new RunnableEBaseShape0S0100000_I0_0(this, 6);

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public boolean enoughToFilter() {
            return this.A00 <= 0 || super.enoughToFilter();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // X.C07530Ya
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A02) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.A01;
            searchView.A0G(searchView.A0H());
            searchView.post(searchView.A0m);
            if (searchView.A0k.hasFocus()) {
                searchView.A04();
            }
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A01.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.A01.hasFocus() && getVisibility() == 0) {
                this.A02 = true;
                if (getContext().getResources().getConfiguration().orientation == 2 && (method = SearchView.A0o.A02) != null) {
                    try {
                        method.invoke(this, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A02 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.A01 = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A00 = i;
        }
    }
}

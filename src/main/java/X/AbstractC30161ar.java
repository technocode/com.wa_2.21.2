package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1ar  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC30161ar extends BaseAdapter implements AbstractC15170nc, Filterable {
    public int A00;
    public Context A01;
    public Cursor A02;
    public DataSetObserver A03;
    public C15150na A04;
    public C15180nd A05;
    public boolean A06;
    public boolean A07;

    public boolean hasStableIds() {
        return true;
    }

    public AbstractC30161ar(Context context) {
        A02(context);
    }

    public AbstractC30161ar(Context context, Cursor cursor, boolean z) {
        A02(context);
    }

    public Cursor A00(Cursor cursor) {
        Cursor cursor2 = this.A02;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C15150na r0 = this.A04;
            if (r0 != null) {
                cursor2.unregisterContentObserver(r0);
            }
            DataSetObserver dataSetObserver = this.A03;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A02 = cursor;
        if (cursor != null) {
            C15150na r02 = this.A04;
            if (r02 != null) {
                cursor.registerContentObserver(r02);
            }
            DataSetObserver dataSetObserver2 = this.A03;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A07 = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.A00 = -1;
        this.A07 = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public View A01(Context context, Cursor cursor, ViewGroup viewGroup) {
        if (!(this instanceof C59312nR)) {
            AnonymousClass28L r3 = (AnonymousClass28L) this;
            View inflate = ((AbstractC452223n) r3).A02.inflate(((AbstractC452223n) r3).A01, viewGroup, false);
            inflate.setTag(new C13520kN(inflate));
            ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(r3.A08);
            return inflate;
        }
        throw new AssertionError();
    }

    public void A02(Context context) {
        this.A06 = true;
        this.A02 = null;
        this.A07 = false;
        this.A01 = context;
        this.A00 = -1;
        this.A04 = new C15150na(this);
        this.A03 = new C15160nb(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v3, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (r1 != null) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r24, android.content.Context r25, android.database.Cursor r26) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC30161ar.A03(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // X.AbstractC15170nc
    public void A2a(Cursor cursor) {
        if (!(this instanceof AnonymousClass28L)) {
            Cursor A002 = A00(cursor);
            if (A002 != null) {
                A002.close();
                return;
            }
            return;
        }
        AnonymousClass28L r1 = (AnonymousClass28L) this;
        try {
            Cursor A003 = r1.A00(cursor);
            if (A003 != null) {
                A003.close();
            }
            if (cursor != null) {
                r1.A04 = cursor.getColumnIndex("suggest_text_1");
                r1.A05 = cursor.getColumnIndex("suggest_text_2");
                r1.A06 = cursor.getColumnIndex("suggest_text_2_url");
                r1.A01 = cursor.getColumnIndex("suggest_icon_1");
                r1.A02 = cursor.getColumnIndex("suggest_icon_2");
                r1.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // X.AbstractC15170nc
    public CharSequence A36(Cursor cursor) {
        String A002;
        if (!(this instanceof AnonymousClass28L)) {
            return cursor == null ? "" : cursor.toString();
        }
        AnonymousClass28L r1 = (AnonymousClass28L) this;
        if (cursor == null) {
            return null;
        }
        String A003 = AnonymousClass28L.A00(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (A003 == null) {
            SearchableInfo searchableInfo = r1.A09;
            if (searchableInfo.shouldRewriteQueryFromData() && (A002 = AnonymousClass28L.A00(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return A002;
            }
            if (!searchableInfo.shouldRewriteQueryFromText() || (A003 = AnonymousClass28L.A00(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
        }
        return A003;
    }

    @Override // X.AbstractC15170nc
    public Cursor ANK(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        if (!(this instanceof AnonymousClass28L)) {
            return this.A02;
        }
        AnonymousClass28L r3 = (AnonymousClass28L) this;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = r3.A0B;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = r3.A09;
                String[] strArr = null;
                if (searchableInfo == null) {
                    cursor = null;
                } else {
                    String suggestAuthority = searchableInfo.getSuggestAuthority();
                    if (suggestAuthority == null) {
                        cursor = null;
                    } else {
                        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                        String suggestPath = searchableInfo.getSuggestPath();
                        if (suggestPath != null) {
                            fragment.appendEncodedPath(suggestPath);
                        }
                        fragment.appendPath("search_suggest_query");
                        String suggestSelection = searchableInfo.getSuggestSelection();
                        if (suggestSelection != null) {
                            strArr = new String[]{charSequence2};
                        } else {
                            fragment.appendPath(charSequence2);
                        }
                        fragment.appendQueryParameter("limit", String.valueOf(50));
                        cursor = ((AbstractC30161ar) r3).A01.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
                    }
                }
                if (cursor != null) {
                    cursor.getCount();
                    return cursor;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.A07) {
            return null;
        }
        this.A02.moveToPosition(i);
        if (view == null) {
            Context context = this.A01;
            Cursor cursor = this.A02;
            if (!(this instanceof AbstractC452223n)) {
                view = A01(context, cursor, viewGroup);
            } else {
                AbstractC452223n r1 = (AbstractC452223n) this;
                view = r1.A02.inflate(r1.A00, viewGroup, false);
            }
        }
        A03(view, this.A01, this.A02);
        return view;
    }

    public Filter getFilter() {
        C15180nd r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C15180nd r02 = new C15180nd(this);
        this.A05 = r02;
        return r02;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A02;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.A07 || (cursor = this.A02) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.A02.getLong(this.A00);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.A07) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.A02.moveToPosition(i)) {
            if (view == null) {
                view = A01(this.A01, this.A02, viewGroup);
            }
            A03(view, this.A01, this.A02);
            return view;
        } else {
            throw new IllegalStateException(AnonymousClass008.A0F("couldn't move cursor to position ", i));
        }
    }
}

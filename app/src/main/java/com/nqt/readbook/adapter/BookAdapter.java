package com.nqt.readbook.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nqt.readbook.R;
import com.nqt.readbook.model.Book;

import java.util.List;

/**
 * Created by USER on 4/16/2018.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
    private List<Book> books;
    private Context context;
    private LayoutInflater inflater;

    public BookAdapter(List<Book> books, Context context) {
        this.books = books;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_info_book, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgTitleBook;
        private TextView txtTitle;
        private TextView txtAuthor;
        private TextView txtYear;
        private TextView txtView;

        public ViewHolder(View itemView) {
            super(itemView);
            imgTitleBook = itemView.findViewById(R.id.img_title_image);
            txtTitle = itemView.findViewById(R.id.txt_title_book);
            txtAuthor = itemView.findViewById(R.id.txt_author_book);
            txtYear = itemView.findViewById(R.id.txt_year_book);
            txtView = itemView.findViewById(R.id.txt_view_book);
        }
    }
}

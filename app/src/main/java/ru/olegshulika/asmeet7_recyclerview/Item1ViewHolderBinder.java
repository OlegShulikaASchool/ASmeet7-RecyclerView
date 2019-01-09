package ru.olegshulika.asmeet7_recyclerview;

import android.support.v7.widget.RecyclerView;

public class Item1ViewHolderBinder extends ViewHolderBinder {
    private final Item mItem;

    public Item1ViewHolderBinder(BaseItem item, int viewType) {
        super(viewType);
        mItem = (Item)item;
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder) {
        Item1ViewHolder item1ViewHolder = (Item1ViewHolder)holder;
        item1ViewHolder.textItem.setText(mItem.getText());
        item1ViewHolder.buttonItem.setText("T"+mItem.getType()+" #"+holder.getAdapterPosition());
    }

    @Override
    public BaseItem getItem() {
        return mItem;
    }
}

package com.example.pulkit.uiflexiblefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by pulkit on 8/14/15.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView listView;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        listView = (ListView) view.findViewById(R.id.list_item);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.titles,android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
        return  view;
    }

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    public interface Communicator {
        public void respond(int data);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);
    }
}

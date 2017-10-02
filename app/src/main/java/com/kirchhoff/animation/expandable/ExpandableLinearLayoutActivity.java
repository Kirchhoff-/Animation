package com.kirchhoff.animation.expandable;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.kirchhoff.animation.R;

import iammert.com.expandablelib.ExpandCollapseListener;
import iammert.com.expandablelib.ExpandableLayout;
import iammert.com.expandablelib.Section;

/**
 * @author Kirchhoff-
 */

public class ExpandableLinearLayoutActivity extends AppCompatActivity {


    public static void start(Context context) {
        Intent intent = new Intent(context, ExpandableLinearLayoutActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_expandable_linear_layout);


        ExpandableLayout el = (ExpandableLayout) findViewById(R.id.el);


        Section<Team, Player> chelsea = new Section<>();
        Team chelseaTeam = new Team("Chelsea");
        chelsea.expanded = true;
        Player chelseaFirst = new Player("Alfaro Morata");
        Player chelseaSecond = new Player("Garry Chahil");
        Player chelseaThird = new Player("Kante");
        chelsea.parent = chelseaTeam;
        chelsea.children.add(chelseaFirst);
        chelsea.children.add(chelseaSecond);
        chelsea.children.add(chelseaThird);

        Section<Team, Player> manU = new Section<>();
        Team manUTeam = new Team("ManU");
        manU.expanded = false;
        Player manUFirst = new Player("Lukaku");
        Player manUSecond = new Player("Mata");
        Player manUThird = new Player("Blind");
        manU.parent = manUTeam;
        manU.children.add(manUFirst);
        manU.children.add(manUSecond);
        manU.children.add(manUThird);

        Section<Team, Player> manCity = new Section<>();
        Team city = new Team("ManCity");
        Player cityFirst = new Player("Aguero");
        Player citySecond = new Player("Silva");
        Player cityThird = new Player("Otamendi");
        manCity.parent = city;
        manCity.children.add(cityFirst);
        manCity.children.add(citySecond);
        manCity.children.add(cityThird);
        manCity.expanded = false;

        el.setRenderer(new ExpandableLayout.Renderer<Team, Player>() {
            @Override
            public void renderParent(View view, Team team, boolean b, int i) {
                ((TextView) view.findViewById(R.id.tvTeam)).setText(team.team);
            }

            @Override
            public void renderChild(View view, Player player, int i, int i1) {
                ((TextView) view.findViewById(R.id.tvPlayer)).setText(player.name);
            }
        });

        el.addSection(manCity);
        el.addSection(chelsea);
        el.addSection(manU);

        el.setExpandListener(new ExpandCollapseListener.ExpandListener<Team>() {
            @Override
            public void onExpanded(int i, Team team, View view) {
                Log.d("TAG", "onExpanded team = " + team.team);
            }
        });

        el.setCollapseListener(new ExpandCollapseListener.CollapseListener<Team>() {
            @Override
            public void onCollapsed(int i, Team team, View view) {
                Log.d("TAG", "onCollapse team = " + team.team);
            }
        });
    }
}

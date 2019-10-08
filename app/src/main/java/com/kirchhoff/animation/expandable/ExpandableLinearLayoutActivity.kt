package com.kirchhoff.animation.expandable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.kirchhoff.animation.R
import iammert.com.expandablelib.ExpandableLayout
import iammert.com.expandablelib.Section

class ExpandableLinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_expandable_linear_layout)

        val el = findViewById<ExpandableLayout>(R.id.el)

        val chelsea = Section<Team, Player>()
        val chelseaTeam = Team("Chelsea")
        chelsea.expanded = true
        val chelseaFirst = Player("Alfaro Morata")
        val chelseaSecond = Player("Garry Chahil")
        val chelseaThird = Player("Kante")
        chelsea.parent = chelseaTeam
        chelsea.children.add(chelseaFirst)
        chelsea.children.add(chelseaSecond)
        chelsea.children.add(chelseaThird)

        val manU = Section<Team, Player>()
        val manUTeam = Team("ManU")
        manU.expanded = false
        val manUFirst = Player("Lukaku")
        val manUSecond = Player("Mata")
        val manUThird = Player("Blind")
        manU.parent = manUTeam
        manU.children.add(manUFirst)
        manU.children.add(manUSecond)
        manU.children.add(manUThird)

        val manCity = Section<Team, Player>()
        val city = Team("ManCity")
        val cityFirst = Player("Aguero")
        val citySecond = Player("Silva")
        val cityThird = Player("Otamendi")
        manCity.parent = city
        manCity.children.add(cityFirst)
        manCity.children.add(citySecond)
        manCity.children.add(cityThird)
        manCity.expanded = false

        el.setRenderer(object : ExpandableLayout.Renderer<Team, Player> {
            override fun renderParent(view: View, team: Team, b: Boolean, i: Int) {
                view.findViewById<TextView>(R.id.tvTeam).text = team.team
            }

            override fun renderChild(view: View, player: Player, i: Int, i1: Int) {
                view.findViewById<TextView>(R.id.tvPlayer).text = player.name
            }
        })

        el.addSection(manCity)
        el.addSection(chelsea)
        el.addSection(manU)
    }
}

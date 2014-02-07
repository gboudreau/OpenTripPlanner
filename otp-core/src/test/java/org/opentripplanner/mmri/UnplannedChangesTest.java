/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

/* this is in api.common so it can set package-private fields */

package org.opentripplanner.mmri;

import org.opentripplanner.api.model.Leg;

public class UnplannedChangesTest extends MmriTest {
    @Override
    final String getFeedName() {
        return "3b";
    }

    public void test3b1() {
        Leg leg = plan(+1388530860L, "3b1", "3b2", null, false, false, null, "", "");

        validateLeg(leg, 1388531460000L, 1388531520000L, "3b2", "3b1", null);
    }

    public void test3b2() {
        Leg leg = plan(+1388531460L, "3b1", "3b2", null, false, false, null, "", "");

        validateLeg(leg, 1388531460000L, 1388531520000L, "3b2", "3b1", null);
    }
}
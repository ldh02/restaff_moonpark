/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.restaff.moonpark.data;
import com.restaff.moonpark.model.ParkZone;
import com.restaff.moonpark.model.ParkZone1;
import com.restaff.moonpark.model.ParkZone2;
import com.restaff.moonpark.model.ParkZone3;

import java.util.List;
import java.util.ArrayList;

public class MoonParkData {
  static List<ParkZone> parkZones = new ArrayList<ParkZone>();

  static {
    parkZones.add(new ParkZone1("M1"));
    parkZones.add(new ParkZone2("M2"));
    parkZones.add(new ParkZone3("M3"));
  }

  public ParkZone findParkZone(String zoneCode) {
    for (ParkZone parkZone : parkZones) {
      if (parkZone.getCode().equals(zoneCode)) {
        return parkZone;
      }
    }
    return null;
  }
}
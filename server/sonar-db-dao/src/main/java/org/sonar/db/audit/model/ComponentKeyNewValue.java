/*
 * SonarQube
 * Copyright (C) 2009-2021 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.db.audit.model;

public class ComponentKeyNewValue extends NewValue{

  private final String componentUuid;
  private final String oldKey;
  private final String newKey;

  public ComponentKeyNewValue(String componentUuid, String oldKey, String newKey) {
    this.componentUuid = componentUuid;
    this.oldKey = oldKey;
    this.newKey = newKey;
  }

  public String getComponentUuid() {
    return componentUuid;
  }

  public String getOldKey() {
    return oldKey;
  }

  public String getNewKey() {
    return newKey;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("{");
    addField(sb, "\"componentUuid\": ", this.getComponentUuid(), true);
    addField(sb, "\"oldKey\": ", this.getOldKey(), true);
    addField(sb, "\"newKey\": ", this.getNewKey(), true);
    endString(sb);
    return sb.toString();
  }

}

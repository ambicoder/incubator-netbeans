/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.css.refactoring.api;

import org.netbeans.modules.css.indexing.CssIndexer;

/**
 *
 * @author mfukala@netbeans.org
 */
public enum RefactoringElementType {
    
    ID(CssIndexer.IDS_KEY), CLASS(CssIndexer.CLASSES_KEY), ELEMENT(CssIndexer.HTML_ELEMENTS_KEY), COLOR(CssIndexer.COLORS_KEY), IMPORT(CssIndexer.IMPORTS_KEY);

    private String indexKey;

    private RefactoringElementType(String indexKey) {
        this.indexKey = indexKey;
    }

    public String getIndexKey() {
        return indexKey;
    }

}

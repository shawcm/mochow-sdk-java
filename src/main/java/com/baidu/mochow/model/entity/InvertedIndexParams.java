/*
 * Copyright 2024 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.baidu.mochow.model.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import com.baidu.mochow.model.enums.InvertedIndexAnalyzer;
import com.baidu.mochow.model.enums.InvertedIndexParseMode;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class InvertedIndexParams implements IndexParams {
    private InvertedIndexAnalyzer analyzer;
    private InvertedIndexParseMode parseMode;

    public InvertedIndexParams(InvertedIndexAnalyzer analyzer, InvertedIndexParseMode parseMode) {
        this.analyzer = analyzer;
        this.parseMode = parseMode;
    }
}
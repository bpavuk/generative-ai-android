/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ai.client.generativeai.internal.api.client

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
internal data class GenerationConfig(
  val temperature: Float?,
  @SerialName("top_p") val topP: Float?,
  @SerialName("top_k") val topK: Int?,
  @SerialName("candidate_count") val candidateCount: Int?,
  @SerialName("max_output_tokens") val maxOutputTokens: Int?,
  @SerialName("stop_sequences") val stopSequences: List<String>?
)

@Serializable internal data class Tool(val functionDeclarations: List<FunctionDeclaration>)

@Serializable
internal data class FunctionDeclaration(
  val name: String,
  val description: String,
  val parameters: FunctionParameters
)

@Serializable
internal data class FunctionParameters(
  val properties: JsonObject,
  val required: List<String>,
  val type: String,
)
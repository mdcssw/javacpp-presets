// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.global;

import org.bytedeco.tritonserver.tritondevelopertoolsserver.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class tritondevelopertoolsserver extends org.bytedeco.tritonserver.presets.tritondevelopertoolsserver {
    static { Loader.load(); }

// Targeting ../tritondevelopertoolsserver/StringSet.java


// Targeting ../tritondevelopertoolsserver/StringVector.java


// Parsed from common.h

// Copyright 2022-2023, NVIDIA CORPORATION & AFFILIATES. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
//  * Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
//  * Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
//  * Neither the name of NVIDIA CORPORATION nor the names of its
//    contributors may be used to endorse or promote products derived
//    from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS ``AS IS'' AND ANY
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
// CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
// EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
// PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
// OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// #pragma once
// #include <climits>
// #include <set>
// #include <vector>
// #include <string>

//==============================================================================
/** enum classes
 *  */
/** enum class triton::developer_tools::server::ModelControlMode */
public static final int NONE = 0, POLL = 1, EXPLICIT = 2;
/** enum class triton::developer_tools::server::MemoryType */
public static final int CPU = 0, CPU_PINNED = 1, GPU = 2;
/** enum class triton::developer_tools::server::DataType */
public static final int
  INVALID = 0,
  BOOL = 1,
  UINT8 = 2,
  UINT16 = 3,
  UINT32 = 4,
  UINT64 = 5,
  INT8 = 6,
  INT16 = 7,
  INT32 = 8,
  INT64 = 9,
  FP16 = 10,
  FP32 = 11,
  FP64 = 12,
  BYTES = 13,
  BF16 = 14;
/** enum class triton::developer_tools::server::ModelReadyState */
public static final int UNKNOWN = 0, READY = 1, UNAVAILABLE = 2, LOADING = 3, UNLOADING = 4;
// Targeting ../tritondevelopertoolsserver/TritonException.java


// Targeting ../tritondevelopertoolsserver/ResponseAllocatorAllocFn_t.java


// Targeting ../tritondevelopertoolsserver/OutputBufferReleaseFn_t.java


// Targeting ../tritondevelopertoolsserver/ResponseAllocatorStartFn_t.java


// Targeting ../tritondevelopertoolsserver/LoggingOptions.java


// Targeting ../tritondevelopertoolsserver/MetricsOptions.java


// Targeting ../tritondevelopertoolsserver/RateLimitResource.java


// Targeting ../tritondevelopertoolsserver/ModelLoadGPULimit.java


// Targeting ../tritondevelopertoolsserver/Allocator.java


// Targeting ../tritondevelopertoolsserver/BackendConfig.java


// Targeting ../tritondevelopertoolsserver/CUDAMemoryPoolByteSize.java


// Targeting ../tritondevelopertoolsserver/HostPolicy.java


// Targeting ../tritondevelopertoolsserver/Trace.java


// Targeting ../tritondevelopertoolsserver/ServerOptions.java


// Targeting ../tritondevelopertoolsserver/RepositoryIndex.java


// Targeting ../tritondevelopertoolsserver/Tensor.java


// Targeting ../tritondevelopertoolsserver/NewModelRepo.java


// Targeting ../tritondevelopertoolsserver/InferOptions.java



  // namespace triton::developer_tools::server


// Parsed from generic_server_wrapper.h

// Copyright 2023, NVIDIA CORPORATION & AFFILIATES. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
//  * Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
//  * Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
//  * Neither the name of NVIDIA CORPORATION nor the names of its
//    contributors may be used to endorse or promote products derived
//    from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS ``AS IS'' AND ANY
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
// CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
// EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
// PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
// OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
// #pragma once
// #include <list>
// #include <memory>
// #include <unordered_map>
// #include <vector>
// #include "../src/infer_requested_output.h"
// #include "../src/tracer.h"
// #include "common.h"

///
// Targeting ../tritondevelopertoolsserver/GenericTritonServer.java


// Targeting ../tritondevelopertoolsserver/GenericInferResult.java


// Targeting ../tritondevelopertoolsserver/GenericInferRequest.java



  // namespace triton::developer_tools::server


}

export type MappingStage =
  | 'PARSING'
  | 'INTERMEDIATE_MAPPING'
  | 'INTERMEDIATE_VALIDATION'
  | 'ATL_TRANSFORMATION'
  | 'COMPUTATIONAL_VALIDATION'
  | 'COMPLETED'
  | 'ERROR';

export interface ValidationResult {
  valid: boolean;
  severity: number;
  diagnostics: string[];
}

export interface DevsMappingResponse {
  success: boolean;
  stage: MappingStage;
  message: string;
  intermediateValidation?: ValidationResult | null;
  computationalValidation?: ValidationResult | null;
  devsModelXmi?: string | null;
  devsComputationalModelXmi?: string | null;
}

export async function mapDevs(source: string): Promise<DevsMappingResponse> {
  const response = await fetch('/api/devs/map', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ source })
  });

  let payload: DevsMappingResponse;
  try {
    payload = await response.json();
  } catch {
    throw new Error(`Mapper_DEVS respondió HTTP ${response.status} sin JSON válido.`);
  }

  if (!response.ok && !payload) {
    throw new Error(`Mapper_DEVS respondió HTTP ${response.status}.`);
  }
  return payload;
}

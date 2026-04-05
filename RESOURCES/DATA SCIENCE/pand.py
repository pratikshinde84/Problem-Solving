import pandas as pd

data = {
    "date": ["2023-01-10", "2024-02-15", "2025-03-20"]
}

df = pd.DataFrame(data)

df["date"] = pd.to_datetime(df["date"])

print(df)